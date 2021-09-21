(ns reagent-mui.icons.desktop-windows-two-tone
  "Imports @mui/icons-material/DesktopWindowsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desktop-windows-two-tone (create-svg-icon [(e "path" #js {"d" "M3 4h18v12H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 2H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h7v2H8v2h8v-2h-2v-2h7c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H3V4h18v12z"})]
                                               "DesktopWindowsTwoTone"))
