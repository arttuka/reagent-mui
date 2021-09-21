(ns reagent-mui.icons.navigation
  "Imports @mui/icons-material/Navigation as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigation (create-svg-icon (e "path" #js {"d" "M12 2 4.5 20.29l.71.71L12 18l6.79 3 .71-.71z"})
                                 "Navigation"))
