(ns reagent-material-ui.icons.network-cell-rounded
  "Imports @material-ui/icons/NetworkCellRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell-rounded (create-svg-icon (e "path" #js {"d" "M4.41 22H21c.55 0 1-.45 1-1V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71zM20 20h-3V9.83l3-3V20z"})
                                           "NetworkCellRounded"))
