(ns reagent-material-ui.icons.lock-sharp
  "Imports @material-ui/icons/LockSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def lock-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "g" #js {"fill" "none"} (e "path" #js {"d" "M0 0h24v24H0V0z"}) (e "path" #js {"d" "M0 0h24v24H0V0z", "opacity" ".87"})) (e "path" #js {"d" "M20 8h-3V6.21c0-2.61-1.91-4.94-4.51-5.19C9.51.74 7 3.08 7 6v2H4v14h16V8zm-8 9c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zM9 8V6c0-1.66 1.34-3 3-3s3 1.34 3 3v2H9z"}))
                                 "LockSharp"))