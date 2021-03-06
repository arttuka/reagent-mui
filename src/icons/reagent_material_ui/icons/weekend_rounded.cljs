(ns reagent-material-ui.icons.weekend-rounded
  "Imports @material-ui/icons/WeekendRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def weekend-rounded (create-svg-icon (e "path" #js {"d" "M21 10c-1.1 0-2 .9-2 2v4H5v-4c0-1.1-.9-2-2-2s-2 .9-2 2v5c0 1.65 1.35 3 3 3h16c1.65 0 3-1.35 3-3v-5c0-1.1-.9-2-2-2zM7 12v2h10v-2c0-1.86 1.28-3.41 3-3.86V7c0-1.65-1.35-3-3-3H7C5.35 4 4 5.35 4 7v1.14c1.72.45 3 2 3 3.86z"})
                                      "WeekendRounded"))
