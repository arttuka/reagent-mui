(ns reagent-mui.icons.short-text
  "Imports @mui/icons-material/ShortText as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def short-text (create-svg-icon (e "path" #js {"d" "M4 9h16v2H4V9zm0 4h10v2H4v-2z"})
                                 "ShortText"))
