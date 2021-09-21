(ns reagent-mui.icons.wifi-protected-setup-sharp
  "Imports @mui/icons-material/WifiProtectedSetupSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-protected-setup-sharp (create-svg-icon [(e "path" #js {"d" "M16.71 5.29 19 3h-8v8l2.3-2.3c1.97 1.46 3.25 3.78 3.25 6.42 0 1.31-.32 2.54-.88 3.63 2.33-1.52 3.88-4.14 3.88-7.13 0-2.52-1.11-4.77-2.84-6.33z"}) (e "path" #js {"d" "M7.46 8.88c0-1.31.32-2.54.88-3.63C6 6.77 4.46 9.39 4.46 12.38c0 2.52 1.1 4.77 2.84 6.33L5 21h8v-8l-2.3 2.3c-1.96-1.46-3.24-3.78-3.24-6.42z"})]
                                                 "WifiProtectedSetupSharp"))
