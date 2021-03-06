(ns reagent-material-ui.icons.surround-sound-rounded
  "Imports @material-ui/icons/SurroundSoundRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def surround-sound-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7.82 16.18c-.43.43-1.15.4-1.5-.09C5.49 14.94 5 13.53 5 12c0-1.53.49-2.94 1.32-4.09.35-.49 1.08-.52 1.5-.09.35.35.38.9.09 1.31C7.34 9.94 7 10.93 7 12s.34 2.06.91 2.87c.29.41.26.96-.09 1.31zM12 15c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm4.18 1.18c-.35-.35-.38-.9-.09-1.31.57-.81.91-1.8.91-2.87s-.34-2.06-.91-2.87c-.29-.41-.26-.95.09-1.31.43-.43 1.15-.4 1.5.09C18.51 9.06 19 10.47 19 12c0 1.53-.49 2.94-1.32 4.09-.35.49-1.07.52-1.5.09z"})
                                             "SurroundSoundRounded"))
