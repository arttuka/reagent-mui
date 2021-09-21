(ns reagent-mui.icons.do-not-disturb-off-two-tone
  "Imports @mui/icons-material/DoNotDisturbOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def do-not-disturb-off-two-tone (create-svg-icon [(e "path" #js {"d" "M7 13v-2h1.17L5.12 7.94C4.41 9.14 4 10.52 4 12c0 4.41 3.59 8 8 8 1.48 0 2.86-.41 4.06-1.12L10.17 13H7zm5-9c-1.48 0-2.86.41-4.06 1.12L13.83 11H17v2h-1.17l3.06 3.06c.7-1.2 1.11-2.58 1.11-4.06 0-4.41-3.59-8-8-8z"}) (e "path" #js {"d" "M12 4c4.41 0 8 3.59 8 8 0 1.48-.41 2.86-1.12 4.06l1.46 1.46C21.39 15.93 22 14.04 22 12c0-5.52-4.48-10-10-10-2.04 0-3.93.61-5.51 1.66l1.46 1.46C9.14 4.41 10.52 4 12 4zm5 9v-2h-3.17l2 2H17zM1.39 4.22l2.27 2.27C2.61 8.07 2 9.96 2 12c0 5.52 4.48 10 10 10 2.04 0 3.93-.61 5.51-1.66l2.27 2.27 1.41-1.41L2.81 2.81 1.39 4.22zm3.73 3.72L8.17 11H7v2h3.17l5.88 5.88C14.86 19.59 13.48 20 12 20c-4.41 0-8-3.59-8-8 0-1.48.41-2.86 1.12-4.06z"})]
                                                  "DoNotDisturbOffTwoTone"))
