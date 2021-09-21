(ns reagent-mui.icons.arrow-back-ios-new
  "Imports @mui/icons-material/ArrowBackIosNew as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-back-ios-new (create-svg-icon (e "path" #js {"d" "M17.77 3.77 16 2 6 12l10 10 1.77-1.77L9.54 12z"})
                                         "ArrowBackIosNew"))
