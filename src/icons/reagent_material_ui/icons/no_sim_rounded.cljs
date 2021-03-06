(ns reagent-material-ui.icons.no-sim-rounded
  "Imports @material-ui/icons/NoSimRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def no-sim-rounded (create-svg-icon (e "path" #js {"d" "M1.39 2.81C1 3.2 1 3.83 1.39 4.22l3.19 3.19L4 8v12c0 1.1.9 2 2 2h12.01c.34 0 .65-.09.92-.24l.85.85c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L2.81 2.81c-.39-.39-1.03-.39-1.42 0zM20 17.17L19.99 4c0-1.1-.89-2-1.99-2h-8L7.41 4.59 20 17.17z"})
                                     "NoSimRounded"))
