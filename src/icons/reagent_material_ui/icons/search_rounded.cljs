(ns reagent-material-ui.icons.search-rounded
  "Imports @material-ui/icons/SearchRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def search-rounded (create-svg-icon (e "path" #js {"d" "M20.29 18.88l-5.56-5.56c1.13-1.55 1.63-3.58.98-5.74-.68-2.23-2.57-3.98-4.85-4.44-4.65-.94-8.66 3.08-7.72 7.72.46 2.29 2.21 4.18 4.44 4.85 2.16.65 4.19.15 5.74-.98l5.56 5.56c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41zM5 9.5C5 7.01 7.01 5 9.5 5S14 7.01 14 9.5 11.99 14 9.5 14 5 11.99 5 9.5z"})
                                     "SearchRounded"))
