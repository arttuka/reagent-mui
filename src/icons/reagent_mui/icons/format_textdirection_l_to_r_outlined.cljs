(ns reagent-mui.icons.format-textdirection-l-to-r-outlined
  "Imports @mui/icons-material/FormatTextdirectionLToROutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-textdirection-l-to-r-outlined (create-svg-icon (e "path" #js {"d" "M9 4v4c-1.1 0-2-.9-2-2s.9-2 2-2m8-2H9C6.79 2 5 3.79 5 6s1.79 4 4 4v5h2V4h2v11h2V4h2V2zm0 12v3H5v2h12v3l4-4-4-4z"})
                                                           "FormatTextdirectionLToROutlined"))
