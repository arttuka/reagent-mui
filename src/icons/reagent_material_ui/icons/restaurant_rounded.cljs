(ns reagent-material-ui.icons.restaurant-rounded
  "Imports @material-ui/icons/RestaurantRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def restaurant-rounded (create-svg-icon (e "path" #js {"d" "M14 7v5c0 1.1.9 2 2 2h1v7c0 .55.45 1 1 1s1-.45 1-1V2c-2.76 0-5 2.24-5 5zm-4 2H9V3c0-.55-.45-1-1-1s-1 .45-1 1v6H6V3c0-.55-.45-1-1-1s-1 .45-1 1v6c0 1.86 1.28 3.41 3 3.86V21c0 .55.45 1 1 1s1-.45 1-1v-8.14c1.72-.45 3-2 3-3.86V3c0-.55-.45-1-1-1s-1 .45-1 1v6z"})
                                         "RestaurantRounded"))
