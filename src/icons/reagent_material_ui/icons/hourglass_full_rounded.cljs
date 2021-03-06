(ns reagent-material-ui.icons.hourglass-full-rounded
  "Imports @material-ui/icons/HourglassFullRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def hourglass-full-rounded (create-svg-icon (e "path" #js {"d" "M18 7V4h1c.55 0 1-.45 1-1s-.45-1-1-1H5c-.55 0-1 .45-1 1s.45 1 1 1h1v3c0 2.09 1.07 3.93 2.69 5C7.07 13.07 6 14.91 6 17v3H5c-.55 0-1 .45-1 1s.45 1 1 1h14c.55 0 1-.45 1-1s-.45-1-1-1h-1v-3c0-2.09-1.07-3.93-2.69-5C16.93 10.93 18 9.09 18 7z"})
                                             "HourglassFullRounded"))
