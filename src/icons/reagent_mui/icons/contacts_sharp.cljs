(ns reagent-mui.icons.contacts-sharp
  "Imports @mui/icons-material/ContactsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def contacts-sharp (create-svg-icon (e "path" #js {"d" "M20 0H4v2h16V0zM4 24h16v-2H4v2zM22 4H2v16h20V4zM12 6.75c1.24 0 2.25 1.01 2.25 2.25s-1.01 2.25-2.25 2.25S9.75 10.24 9.75 9 10.76 6.75 12 6.75zM17 17H7v-1.5c0-1.67 3.33-2.5 5-2.5s5 .83 5 2.5V17z"})
                                     "ContactsSharp"))
