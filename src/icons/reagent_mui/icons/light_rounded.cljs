(ns reagent-mui.icons.light-rounded
  "Imports @mui/icons-material/LightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def light-rounded (create-svg-icon (e "path" #js {"d" "M13 6.06V4c0-.55-.45-1-1-1s-1 .45-1 1v2.06c-4.5.5-8 4.31-8 8.93C3 16.1 3.9 17 5.01 17H8c0 2.21 1.79 4 4 4s4-1.79 4-4h2.99c1.11 0 2.01-.9 2.01-2.01 0-4.62-3.5-8.43-8-8.93zM12 15H5c0-3.86 3.14-7 7-7s7 3.14 7 7h-7z"})
                                    "LightRounded"))
