(ns reagent-material-ui.icons.five-k-sharp
  "Imports @material-ui/icons/FiveKSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def five-k-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-10 7.5H8v1h3V15H6.5v-1.5h3v-1h-3V9H11v1.5zm7 4.5h-1.75l-1.75-2.25V15H13V9h1.5v2.25L16.25 9H18l-2.25 3L18 15z"})
                                   "FiveKSharp"))