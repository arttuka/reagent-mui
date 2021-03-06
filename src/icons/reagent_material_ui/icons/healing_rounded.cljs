(ns reagent-material-ui.icons.healing-rounded
  "Imports @material-ui/icons/HealingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def healing-rounded (create-svg-icon (e "path" #js {"d" "M17.68 12l3.73-3.73c.78-.78.78-2.05 0-2.83l-2.85-2.85c-.39-.39-.9-.59-1.41-.59s-1.02.2-1.41.59L12 6.32 8.27 2.59C7.87 2.2 7.36 2 6.85 2c-.51 0-1.02.2-1.41.59L2.59 5.44c-.78.78-.78 2.05 0 2.83L6.32 12l-3.73 3.73c-.78.78-.78 2.05 0 2.83l2.85 2.85c.39.39.9.59 1.41.59.51 0 1.02-.2 1.41-.59L12 17.68l3.73 3.73c.39.39.9.59 1.41.59.51 0 1.02-.2 1.41-.59l2.85-2.85c.78-.78.78-2.05 0-2.83L17.68 12zM12 9c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm-4.27 1.59L4 6.85 6.85 4l3.73 3.73-2.85 2.86zM10 13c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm2 2c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm1-3c0-.55.45-1 1-1s1 .45 1 1-.45 1-1 1-1-.45-1-1zm4.15 8l-3.73-3.73 2.85-2.85L20 17.15 17.15 20z"})
                                      "HealingRounded"))
