(ns reagent-material-ui.icons.swap-vertical-circle-rounded
  "Imports @material-ui/icons/SwapVerticalCircleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def swap-vertical-circle-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7.35 8.15l2.3-2.3c.2-.2.51-.2.71 0l2.29 2.3c.31.31.09.85-.35.85H11v3c0 .55-.45 1-1 1s-1-.45-1-1V9H7.71c-.45 0-.67-.54-.36-.85zm7 10c-.2.2-.51.2-.71 0l-2.29-2.3c-.31-.31-.09-.85.35-.85H13v-3c0-.55.45-1 1-1s1 .45 1 1v3h1.29c.45 0 .67.54.35.85l-2.29 2.3z"})
                                                   "SwapVerticalCircleRounded"))
