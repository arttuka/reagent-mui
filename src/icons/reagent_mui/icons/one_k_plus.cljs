(ns reagent-mui.icons.one-k-plus
  "Imports @mui/icons-material/OneKPlus as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def one-k-plus (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM9 15H7.5v-4.5H6V9h3v6zm4.75 0L12 12.75V15h-1.5V9H12v2.25L13.75 9h1.75l-2.25 3 2.25 3h-1.75zm5.75-2.5H18V14h-1v-1.5h-1.5v-1H17V10h1v1.5h1.5v1z"})
                                 "OneKPlus"))