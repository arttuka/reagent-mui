(ns reagent-material-ui.icons.keyboard-backspace-rounded
  "Imports @material-ui/icons/KeyboardBackspaceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-backspace-rounded (create-svg-icon (e "path" #js {"d" "M19.58 10.58H6.41L9.29 7.7c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-4.59 4.59c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-2.88-2.89h13.17c.55 0 1-.45 1-1s-.45-1-1-1z"})
                                                 "KeyboardBackspaceRounded"))
