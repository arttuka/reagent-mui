(ns reagent-mui.icons.snooze-outlined
  "Imports @mui/icons-material/SnoozeOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def snooze-outlined (create-svg-icon (e "path" #js {"d" "M9 11h3.63L9 15.2V17h6v-2h-3.63L15 10.8V9H9v2zm7.056-7.654 1.282-1.535 4.607 3.85-1.28 1.54zM3.336 7.19l-1.28-1.536L6.662 1.81l1.28 1.536zM12 6c3.86 0 7 3.14 7 7s-3.14 7-7 7-7-3.14-7-7 3.14-7 7-7m0-2c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9z"})
                                      "SnoozeOutlined"))
