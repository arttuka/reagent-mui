(ns reagent-mui.icons.keyboard-backspace
  "Imports @mui/icons-material/KeyboardBackspace as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-backspace (create-svg-icon (e "path" #js {"d" "M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"})
                                         "KeyboardBackspace"))
