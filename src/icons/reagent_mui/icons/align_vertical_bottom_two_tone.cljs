(ns reagent-mui.icons.align-vertical-bottom-two-tone
  "Imports @mui/icons-material/AlignVerticalBottomTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-vertical-bottom-two-tone (create-svg-icon (e "path" #js {"d" "M22 22H2v-2h20v2zM10 2H7v16h3V2zm7 6h-3v10h3V8z"})
                                                     "AlignVerticalBottomTwoTone"))
