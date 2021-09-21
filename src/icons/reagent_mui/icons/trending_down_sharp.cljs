(ns reagent-mui.icons.trending-down-sharp
  "Imports @mui/icons-material/TrendingDownSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def trending-down-sharp (create-svg-icon (e "path" #js {"d" "m16 18 2.29-2.29-4.88-4.88-4 4L2 7.41 3.41 6l6 6 4-4 6.3 6.29L22 12v6h-6z"})
                                          "TrendingDownSharp"))
