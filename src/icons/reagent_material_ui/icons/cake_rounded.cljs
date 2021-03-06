(ns reagent-material-ui.icons.cake-rounded
  "Imports @material-ui/icons/CakeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def cake-rounded (create-svg-icon (e "path" #js {"d" "M19 10c0-1.1-.9-2-2-2h-4V6.55c.15-.09.29-.18.41-.31.39-.39.59-.92.59-1.42s-.2-1.02-.59-1.41l-1.06-1.06c-.2-.2-.51-.2-.71 0l-1.06 1.06c-.38.39-.58.91-.58 1.41s.2 1.03.59 1.42c.13.13.27.22.41.31V8H7c-1.1 0-2 .9-2 2v3h14v-3zm0 5H5c-1.1 0-2 .9-2 2v4c0 .55.45 1 1 1h16c.55 0 1-.45 1-1v-4c0-1.1-.9-2-2-2z"})
                                   "CakeRounded"))
