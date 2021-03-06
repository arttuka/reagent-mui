(ns reagent-material-ui.icons.thumb-up-off-alt-sharp
  "Imports @material-ui/icons/ThumbUpOffAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def thumb-up-off-alt-sharp (create-svg-icon (e "path" #js {"d" "M14.17 1L7 8.18V21h12.31L23 12.4V8h-8.31l1.12-5.38L14.17 1zM1 9h4v12H1V9z"})
                                             "ThumbUpOffAltSharp"))
