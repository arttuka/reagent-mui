(ns reagent-material-ui.icons.do-disturb-off-sharp
  "Imports @material-ui/icons/DoDisturbOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def do-disturb-off-sharp (create-svg-icon (e "path" #js {"d" "M17 11v2h-.88l4.33 4.33C21.43 15.79 22 13.96 22 12c0-5.52-4.48-10-10-10-1.96 0-3.79.57-5.33 1.55L14.12 11H17zM2.41 2.13L1 3.54l2.78 2.78C2.66 7.93 2 9.89 2 12c0 5.52 4.48 10 10 10 2.11 0 4.07-.66 5.68-1.78L20.46 23l1.41-1.41L2.41 2.13zM7 13v-2h1.46l2 2H7z"})
                                           "DoDisturbOffSharp"))
