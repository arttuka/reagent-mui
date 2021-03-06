(ns reagent-material-ui.icons.linear-scale-rounded
  "Imports @material-ui/icons/LinearScaleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def linear-scale-rounded (create-svg-icon (e "path" #js {"d" "M17 7c-2.41 0-4.43 1.72-4.9 4H6.79c-.39-.88-1.27-1.5-2.29-1.5C3.12 9.5 2 10.62 2 12s1.12 2.5 2.5 2.5c1.02 0 1.9-.62 2.29-1.5h5.31c.46 2.28 2.48 4 4.9 4 2.76 0 5-2.24 5-5s-2.24-5-5-5zm0 8c-1.65 0-3-1.35-3-3s1.35-3 3-3 3 1.35 3 3-1.35 3-3 3z"})
                                           "LinearScaleRounded"))
