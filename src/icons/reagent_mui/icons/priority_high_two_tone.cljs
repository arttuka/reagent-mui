(ns reagent-mui.icons.priority-high-two-tone
  "Imports @mui/icons-material/PriorityHighTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def priority-high-two-tone (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "19", "r" "2"}) (e "path" #js {"d" "M10 3h4v12h-4z"})]
                                             "PriorityHighTwoTone"))
