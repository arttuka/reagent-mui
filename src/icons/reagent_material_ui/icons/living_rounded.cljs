(ns reagent-material-ui.icons.living-rounded
  "Imports @material-ui/icons/LivingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def living-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.5 11.5c-.55 0-1 .45-1 1v2h-7v-2c0-.55-.45-1-1-1s-1 .45-1 1V16c0 .28.22.5.5.5h10c.28 0 .5-.22.5-.5v-3.5c0-.55-.45-1-1-1z"}) (e "path" #js {"d" "M10 12.5v.5h4v-.5c0-1.3.99-2.35 2.25-2.47V9c0-.83-.67-1.5-1.5-1.5h-5.5c-.83 0-1.5.67-1.5 1.5v1.03C9.01 10.15 10 11.2 10 12.5z"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-1 14c0 1.1-.9 2-2 2H7c-1.1 0-2-.9-2-2v-3.5c0-.92.51-1.72 1.25-2.15V9c0-1.66 1.34-3 3-3h5.5c1.66 0 3 1.34 3 3v1.35c.74.43 1.25 1.23 1.25 2.15V16z"}))
                                     "LivingRounded"))
