(ns reagent-material-ui.icons.five-mp-sharp
  "Imports @material-ui/icons/FiveMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def five-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 14h1.5v1.5H15z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm7 7h3V9h-3V5.5h4.5V7h-3v1h3v3.5H10V10zm2.5 8.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM18 17h-3v1.5h-1.5v-6H18V17z"}))
                                    "FiveMpSharp"))