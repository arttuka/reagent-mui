(ns reagent-mui.icons.transit-enterexit-sharp
  "Imports @mui/icons-material/TransitEnterexitSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def transit-enterexit-sharp (create-svg-icon (e "path" #js {"d" "M16 18H6V8h3v4.77L15.98 6 18 8.03 11.15 15H16v3z"})
                                              "TransitEnterexitSharp"))
