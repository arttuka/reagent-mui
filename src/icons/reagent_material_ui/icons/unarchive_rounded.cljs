(ns reagent-material-ui.icons.unarchive-rounded
  "Imports @material-ui/icons/UnarchiveRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def unarchive-rounded (create-svg-icon (e "path" #js {"d" "M20.54 5.23l-1.39-1.68C18.88 3.21 18.47 3 18 3H6c-.47 0-.88.21-1.16.55L3.46 5.23C3.17 5.57 3 6.02 3 6.5V19c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6.5c0-.48-.17-.93-.46-1.27zM14.79 13H13v3.04c0 .55-.45 1-1 1s-1-.45-1-1V13H9.21c-.45 0-.67-.54-.35-.85l2.79-2.79c.2-.2.51-.2.71 0l2.79 2.79c.31.31.09.85-.36.85zM5.41 6l.83-1h11.52l.84 1H5.41z"})
                                        "UnarchiveRounded"))
