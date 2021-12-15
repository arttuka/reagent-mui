(ns reagent-mui.icons.art-track-outlined
  "Imports @mui/icons-material/ArtTrackOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def art-track-outlined (create-svg-icon (e "path" #js {"d" "M22 13h-8v-2h8v2zm0-6h-8v2h8V7zm-8 10h8v-2h-8v2zm-2-8v6c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V9c0-1.1.9-2 2-2h6c1.1 0 2 .9 2 2zm-1.5 6-2.25-3-1.75 2.26-1.25-1.51L3.5 15h7z"})
                                         "ArtTrackOutlined"))