(ns reagent-mui.icons.align-horizontal-left-outlined
  "Imports @mui/icons-material/AlignHorizontalLeftOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-horizontal-left-outlined (create-svg-icon (e "path" #js {"d" "M4 22H2V2h2v20zM22 7H6v3h16V7zm-6 7H6v3h10v-3z"})
                                                     "AlignHorizontalLeftOutlined"))
