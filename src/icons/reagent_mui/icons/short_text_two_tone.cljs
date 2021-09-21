(ns reagent-mui.icons.short-text-two-tone
  "Imports @mui/icons-material/ShortTextTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def short-text-two-tone (create-svg-icon (e "path" #js {"d" "M4 9h16v2H4zm0 4h10v2H4z"})
                                          "ShortTextTwoTone"))
