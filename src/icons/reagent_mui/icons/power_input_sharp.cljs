(ns reagent-mui.icons.power-input-sharp
  "Imports @mui/icons-material/PowerInputSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def power-input-sharp (create-svg-icon (e "path" #js {"d" "M2 9v2h19V9H2zm0 6h5v-2H2v2zm7 0h5v-2H9v2zm7 0h5v-2h-5v2z"})
                                        "PowerInputSharp"))
