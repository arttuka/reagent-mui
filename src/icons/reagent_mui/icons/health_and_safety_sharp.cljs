(ns reagent-mui.icons.health-and-safety-sharp
  "Imports @mui/icons-material/HealthAndSafetySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def health-and-safety-sharp (create-svg-icon (e "path" #js {"d" "M10.5 13H8v-3h2.5V7.5h3V10H16v3h-2.5v2.5h-3V13zM12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3z"})
                                              "HealthAndSafetySharp"))
