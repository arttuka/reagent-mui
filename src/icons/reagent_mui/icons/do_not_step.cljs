(ns reagent-mui.icons.do-not-step
  "Imports @mui/icons-material/DoNotStep as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def do-not-step (create-svg-icon (e "path" #js {"d" "m1.39 4.22 7.9 7.9c.18.2.18.5-.01.7-.1.1-.23.15-.35.15s-.26-.05-.35-.15L6.87 11.1c-.11.4-.26.78-.45 1.12l1.4 1.4c.2.2.2.51 0 .71-.1.1-.23.15-.35.15s-.26-.05-.35-.15l-1.27-1.27c-.24.29-.5.56-.77.8l1.28 1.28c.2.2.2.51 0 .71-.1.1-.23.15-.36.15s-.26-.05-.35-.15l-1.38-1.38c-.69.46-1.39.79-1.97 1.02-.78.31-1.3 1.04-1.3 1.88V20h9.5l3.33-3.33 5.94 5.94 1.41-1.41L2.81 2.81 1.39 4.22zm17.12 11.46-1.41-1.41 4.48-4.48L23 11.2l-4.49 4.48zm2.37-6.6-4.48 4.48-7.1-7.09L13.8 2l7.08 7.08z"})
                                  "DoNotStep"))
