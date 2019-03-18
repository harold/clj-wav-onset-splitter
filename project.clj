(defproject clj-wav-onset-splitter "0.1.0-SNAPSHOT"
  :description "An application for splitting wav files into smaller wav files at the onset of each audio 'event'."
  :url "http://github.com/harold/clj-wav-onset-splitter"
  :license {:name "MIT"
            :url "https://tldrlegal.com/license/mit-license"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :java-source-paths ["java/"]
  :main ^:skip-aot clj-wav-onset-splitter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
