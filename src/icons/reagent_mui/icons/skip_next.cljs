(ns reagent-mui.icons.skip-next
  "Imports @mui/icons-material/SkipNext as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-next (create-svg-icon (e "path" #js {"d" "m6 18 8.5-6L6 6v12zM16 6v12h2V6h-2z"})
                                "SkipNext"))
