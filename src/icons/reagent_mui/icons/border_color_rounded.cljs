(ns reagent-mui.icons.border-color-rounded
  "Imports @mui/icons-material/BorderColorRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def border-color-rounded (create-svg-icon [(e "path" #js {"d" "M17.75 7 14 3.25 4.15 13.1c-.1.1-.15.22-.15.36v3.04c0 .28.22.5.5.5h3.04c.13 0 .26-.05.35-.15L17.75 7zm2.96-2.96c.39-.39.39-1.02 0-1.41L18.37.29a.9959.9959 0 0 0-1.41 0L15 2.25 18.75 6l1.96-1.96z"}) (e "path" #js {"fillOpacity" ".36", "d" "M2 20h20c1.1 0 2 .9 2 2s-.9 2-2 2H2c-1.1 0-2-.9-2-2s.9-2 2-2z"})]
                                           "BorderColorRounded"))
