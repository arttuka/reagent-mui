(ns reagent-mui.icons.assignment-returned-sharp
  "Imports @mui/icons-material/AssignmentReturnedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assignment-returned-sharp (create-svg-icon (e "path" #js {"d" "M21 3h-6.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H3v18h18V3zm-9 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm0 15-5-5h3V9h4v4h3l-5 5z"})
                                                "AssignmentReturnedSharp"))
