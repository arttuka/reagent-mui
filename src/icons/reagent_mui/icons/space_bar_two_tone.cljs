(ns reagent-mui.icons.space-bar-two-tone
  "Imports @mui/icons-material/SpaceBarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def space-bar-two-tone (create-svg-icon (e "path" #js {"d" "M18 13H6V9H4v6h16V9h-2z"})
                                         "SpaceBarTwoTone"))
