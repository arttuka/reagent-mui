(ns reagent-mui.icons.remove-done-rounded
  "Imports @mui/icons-material/RemoveDoneRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remove-done-rounded (create-svg-icon (e "path" #js {"d" "M4.14 2.69c-.39.39-.39 1.02 0 1.41l9.67 9.67-1.41 1.41-3.54-3.53a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.24 4.24c.39.39 1.02.39 1.41 0l2.12-2.12 5.89 5.89c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L5.55 2.69a.9959.9959 0 0 0-1.41 0zm13.91 9.67 4.24-4.24c.39-.39.39-1.03-.01-1.42-.39-.38-1.02-.38-1.41.01l-4.24 4.24 1.42 1.41zM16.64 6.7a.9959.9959 0 0 0-1.41 0l-1.42 1.42 1.41 1.41 1.42-1.42c.39-.39.39-1.02 0-1.41zM1.79 13.06l4.95 4.95 1.41-1.41-4.95-4.95a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41z"})
                                          "RemoveDoneRounded"))
