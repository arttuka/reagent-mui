(ns reagent-mui.icons.open-in-new-off-sharp
  "Imports @mui/icons-material/OpenInNewOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def open-in-new-off-sharp (create-svg-icon (e "path" #js {"d" "M16.79 5.8 14 3h7v7l-2.79-2.8-4.09 4.09-1.41-1.41 4.08-4.08zM19 12v4.17l2 2V12h-2zm.78 10.61L18.17 21H3V5.83L1.39 4.22 2.8 2.81l18.38 18.38-1.4 1.42zM16.17 19l-4.88-4.88-1.59 1.59-1.41-1.41 1.59-1.59L5 7.83V19h11.17zM7.83 5H12V3H5.83l2 2z"})
                                            "OpenInNewOffSharp"))
