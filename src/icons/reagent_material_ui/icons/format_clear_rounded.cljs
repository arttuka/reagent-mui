(ns reagent-material-ui.icons.format-clear-rounded
  "Imports @material-ui/icons/FormatClearRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-clear-rounded (create-svg-icon (e "path" #js {"d" "M13.2 10.37L14.21 8h4.29c.83 0 1.5-.67 1.5-1.5S19.33 5 18.5 5H7.83l5.37 5.37zM2.1 3.51c-.39.39-.39 1.02 0 1.41l7.3 7.3-2.08 4.85c-.39.92.28 1.93 1.27 1.93.55 0 1.05-.33 1.27-.84l1.64-3.84 7.57 7.57c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0z"})
                                           "FormatClearRounded"))
