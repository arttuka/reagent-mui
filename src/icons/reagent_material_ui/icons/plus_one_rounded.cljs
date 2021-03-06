(ns reagent-material-ui.icons.plus-one-rounded
  "Imports @material-ui/icons/PlusOneRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def plus-one-rounded (create-svg-icon (e "path" #js {"d" "M10 12H8v-2c0-.55-.45-1-1-1s-1 .45-1 1v2H4c-.55 0-1 .45-1 1s.45 1 1 1h2v2c0 .55.45 1 1 1s1-.45 1-1v-2h2c.55 0 1-.45 1-1s-.45-1-1-1zm6.81-7c-.25 0-.49.08-.7.23l-2.99 2.16c-.45.33-.57.95-.26 1.42.33.49 1 .62 1.48.27l1.41-1.02v9.82c0 .62.5 1.13 1.13 1.13C17.5 19 18 18.5 18 17.87V6.19C18 5.53 17.47 5 16.81 5z"})
                                       "PlusOneRounded"))
