(ns reagent-mui.icons.near-me-sharp
  "Imports @mui/icons-material/NearMeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def near-me-sharp (create-svg-icon (e "path" #js {"d" "M21 3 3 10.53v.98l6.84 2.65L12.48 21h.98L21 3z"})
                                    "NearMeSharp"))
