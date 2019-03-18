# clj-wav-onset-splitter

An application for splitting wav files into smaller wav files at the onset of each audio 'event'.

Some code taken (with immense gratitude) from: https://github.com/Shemahmforash/SoundIt

## Usage

Set `clj-wav-onset-splitter.core/wav-file-path` and `lein run` or `lein repl` & `(-main)`.

### Note

Also cleaned up wav headers with `qwavheaderdump -F 190317_1023.wav` per https://www.hecticgeek.com/2012/06/fix-wav-header-errors-ubuntu-linux/

## License

Copyright © 2019 Harold

This program and the accompanying materials are made available under the terms
of the MIT License which is available at
https://tldrlegal.com/license/mit-license
