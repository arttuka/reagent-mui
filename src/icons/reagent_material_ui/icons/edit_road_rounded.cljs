(ns reagent-material-ui.icons.edit-road-rounded
  "Imports @material-ui/icons/EditRoadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def edit-road-rounded (create-svg-icon (e "path" #js {"d" "M17 4c-.55 0-1 .45-1 1v4.49c0 .89 1.08 1.34 1.71.71.18-.19.29-.45.29-.71V5c0-.55-.45-1-1-1zM5 4c.55 0 1 .45 1 1v14c0 .55-.45 1-1 1s-1-.45-1-1V5c0-.55.45-1 1-1zm6 0c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1s-1-.45-1-1V5c0-.55.45-1 1-1zm0 6c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-.55.45-1 1-1zm0 6c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-.55.45-1 1-1zm11.56-3.41l-1.15-1.15c-.59-.59-1.54-.59-2.12 0l-4.99 5c-.19.18-.3.44-.3.7V19c0 .55.45 1 1 1h1.86c.27 0 .52-.11.71-.29l4.99-5c.59-.59.59-1.54 0-2.12zm-5.98 5.86h-1.03v-1.03L19 13.97 20.03 15l-3.45 3.45z"})
                                        "EditRoadRounded"))
