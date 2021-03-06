(ns reagent-material-ui.icons.how-to-reg-rounded
  "Imports @material-ui/icons/HowToRegRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def how-to-reg-rounded (create-svg-icon (e "path" #js {"d" "M10 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm.62 3.56l2.25-2.25c-.9-.19-1.85-.31-2.87-.31-2.53 0-4.71.7-6.39 1.56-1 .51-1.61 1.54-1.61 2.66V19c0 .55.45 1 1 1h9.23l-1.62-1.62c-.77-.78-.77-2.04.01-2.82zm9.26-2.32l-4.35 4.35-1.32-1.32a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.03 2.03c.39.39 1.02.39 1.41 0l5.06-5.06c.39-.39.39-1.02 0-1.41-.4-.39-1.03-.39-1.42 0z"})
                                         "HowToRegRounded"))
