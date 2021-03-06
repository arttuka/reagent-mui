(ns reagent-material-ui.icons.network-cell-sharp
  "Imports @material-ui/icons/NetworkCellSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell-sharp (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22zm18-2h-3V9.83l3-3V20z"})
                                         "NetworkCellSharp"))
