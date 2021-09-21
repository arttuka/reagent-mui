(ns reagent-mui.icons.receipt-long-sharp
  "Imports @mui/icons-material/ReceiptLongSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def receipt-long-sharp (create-svg-icon [(e "path" #js {"d" "M19.5 3.5 18 2l-1.5 1.5L15 2l-1.5 1.5L12 2l-1.5 1.5L9 2 7.5 3.5 6 2v14H3v3c0 1.66 1.34 3 3 3h12c1.66 0 3-1.34 3-3V2l-1.5 1.5zM15 20H6c-.55 0-1-.45-1-1v-1h10v2zm4-1c0 .55-.45 1-1 1s-1-.45-1-1v-3H8V5h11v14z"}) (e "path" #js {"d" "M9 7h6v2H9zm0 3h6v2H9zm7-3h2v2h-2zm0 3h2v2h-2z"})]
                                         "ReceiptLongSharp"))
