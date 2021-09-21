(ns reagent-mui.icons.h-mobiledata-sharp
  "Imports @mui/icons-material/HMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def h-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M15 11H9V7H7v10h2v-4h6v4h2V7h-2v4z"})
                                         "HMobiledataSharp"))
