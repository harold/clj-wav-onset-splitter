(ns clj-wav-onset-splitter.core
  (:require [clojure.java.io :as io]
            [clojure.java.shell :as sh])
  (:import [com.icdif.audio.io WavDecoder]
           [com.icdif.audio.analysis SpectralDifference PeakDetector])
  (:gen-class))

(defonce sd* (atom nil))

(def wav-file-path "./190317_1023.wav")

(defn -main
  [& args]
  (let [wd (WavDecoder. (io/input-stream wav-file-path))
        sd (time (SpectralDifference. wd 1024 512 true 44100))
        pd (time (PeakDetector. (.getSpectralDifference sd) 10 4.0))
        _ (time (.calcPeaks pd))
        onsets (time (vec (.getPeaksAsInstantsInTime pd 512 44100)))
        n (time (count onsets))]
    (println "Onsets:" n)
    (doseq [i (range (dec n))]
      (let [path (format "samples/%07d.wav" i)]
        (println path)
        (sh/sh "sox" wav-file-path path "trim" (format "%f" (nth onsets i)) (format "=%f" (nth onsets (inc i))))))))
