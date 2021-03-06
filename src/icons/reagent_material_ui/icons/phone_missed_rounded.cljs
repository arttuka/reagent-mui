(ns reagent-material-ui.icons.phone-missed-rounded
  "Imports @material-ui/icons/PhoneMissedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-missed-rounded (create-svg-icon (e "path" #js {"d" "M22.91 16.71C18.58 12.1 13.09 12 12 12s-6.58.1-10.91 4.71c-.38.4-.38 1.02.01 1.41l2.29 2.27c.35.35.91.39 1.3.09L7.6 18.3c.25-.19.4-.49.4-.8v-2.87c1.26-.4 2.6-.63 4-.63s2.74.23 4 .63v2.87c0 .31.15.61.4.8l2.91 2.18c.4.3.95.26 1.3-.09l2.29-2.27c.39-.39.39-1.01.01-1.41zm-10.26-6.05L18.31 5c.39-.39.39-1.02 0-1.41-.39-.39-1.03-.39-1.42 0l-4.95 4.95L8.7 5.3l1.45-1.45c.31-.31.09-.85-.36-.85H5.5c-.28 0-.5.22-.5.5v4.29c0 .45.54.67.85.35l1.43-1.43 3.95 3.95c.39.39 1.03.39 1.42 0z"})
                                           "PhoneMissedRounded"))
