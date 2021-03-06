(ns reagent-material-ui.icons.done-all-rounded
  "Imports @material-ui/icons/DoneAllRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def done-all-rounded (create-svg-icon (e "path" #js {"d" "M20.83 6.7l-8.48 8.48-3.54-3.53a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.24 4.24c.39.39 1.02.39 1.41 0l9.18-9.18c.39-.39.39-1.03-.01-1.42-.38-.39-1-.38-1.39 0zm-4.23 0a.9959.9959 0 0 0-1.41 0l-4.24 4.24 1.41 1.41 4.24-4.24c.39-.39.39-1.02 0-1.41zM1.75 13.06l4.24 4.24c.39.39 1.02.39 1.41 0l.71-.71-4.95-4.95a.9959.9959 0 0 0-1.41 0c-.39.4-.39 1.03 0 1.42z"})
                                       "DoneAllRounded"))
