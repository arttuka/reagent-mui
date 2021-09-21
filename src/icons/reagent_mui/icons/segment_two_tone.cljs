(ns reagent-mui.icons.segment-two-tone
  "Imports @mui/icons-material/SegmentTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def segment-two-tone (create-svg-icon (e "path" #js {"d" "M9 18h12v-2H9v2zM3 6v2h18V6H3zm6 7h12v-2H9v2z"})
                                       "SegmentTwoTone"))
