(ns reagent-mui.icons.south-two-tone
  "Imports @mui/icons-material/SouthTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-two-tone (create-svg-icon (e "path" #js {"d" "m19 15-1.41-1.41L13 18.17V2h-2v16.17l-4.59-4.59L5 15l7 7 7-7z"})
                                     "SouthTwoTone"))
