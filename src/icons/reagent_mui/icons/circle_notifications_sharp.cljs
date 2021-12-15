(ns reagent-mui.icons.circle-notifications-sharp
  "Imports @mui/icons-material/CircleNotificationsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def circle-notifications-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 16.5c-.83 0-1.5-.67-1.5-1.5h3c0 .83-.67 1.5-1.5 1.5zm5-2.5H7v-2h1v-3c0-1.86 1.28-3.41 3-3.86V5.5h2v1.64c1.72.45 3 2 3 3.86v3h1v2z"})
                                                 "CircleNotificationsSharp"))