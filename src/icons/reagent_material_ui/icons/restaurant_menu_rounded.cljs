(ns reagent-material-ui.icons.restaurant-menu-rounded
  "Imports @material-ui/icons/RestaurantMenuRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def restaurant-menu-rounded (create-svg-icon (e "path" #js {"d" "M13.41 12l1.26-1.26c1.4.6 3.32.14 4.75-1.3 1.75-1.75 2.09-4.27.74-5.62-1.34-1.34-3.85-1.01-5.62.74-1.43 1.43-1.9 3.36-1.29 4.76L3.7 18.87c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L12 13.41l6.88 6.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L13.41 12zm-6.07.42l3.21-3.21-5.4-5.4c-.48-.47-1.28-.36-1.6.23-.94 1.72-.68 3.92.78 5.37l3.01 3.01z"})
                                              "RestaurantMenuRounded"))
