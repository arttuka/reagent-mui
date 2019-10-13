(ns reagent-material-ui.icons.build
  "Imports @material-ui/icons/Build as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def build (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0z", "fill" "none", "clipRule" "evenodd"}) (e "path" #js {"d" "M22.7 19l-9.1-9.1c.9-2.3.4-5-1.5-6.9-2-2-5-2.4-7.4-1.3L9 6 6 9 1.6 4.7C.4 7.1.9 10.1 2.9 12.1c1.9 1.9 4.6 2.4 6.9 1.5l9.1 9.1c.4.4 1 .4 1.4 0l2.3-2.3c.5-.4.5-1.1.1-1.4z"}))
                            "Build"))