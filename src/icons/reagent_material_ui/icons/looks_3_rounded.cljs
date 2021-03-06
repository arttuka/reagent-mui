(ns reagent-material-ui.icons.looks-3-rounded
  "Imports @material-ui/icons/Looks3Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-3-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.11 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-4 7.5c0 .83-.67 1.5-1.5 1.5.83 0 1.5.67 1.5 1.5V15c0 1.1-.9 2-2 2h-3c-.55 0-1-.45-1-1s.45-1 1-1h3v-2h-1c-.55 0-1-.45-1-1s.45-1 1-1h1V9h-3c-.55 0-1-.45-1-1s.45-1 1-1h3c1.1 0 2 .89 2 2v1.5z"})
                                      "Looks3Rounded"))
