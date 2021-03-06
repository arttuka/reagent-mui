(ns reagent-material-ui.icons.airplanemode-inactive-rounded
  "Imports @material-ui/icons/AirplanemodeInactiveRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def airplanemode-inactive-rounded (create-svg-icon (e "path" #js {"d" "M21.48 13.7L13.5 9V3.58c0-.81-.61-1.54-1.42-1.58-.87-.04-1.58.64-1.58 1.5v4.59l6.42 6.42 3.74 1.1c.67.19 1.34-.31 1.34-1.01 0-.37-.2-.72-.52-.9zM3.31 3.72a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l5.62 5.62-5 2.94c-.32.19-.52.54-.52.91 0 .7.67 1.2 1.34 1.01l6.97-2.05.19.19V19l-1.67 1.25c-.21.16-.33.4-.33.66 0 .55.52.94 1.05.79L12 21l2.45.7c.52.15 1.05-.24 1.05-.79 0-.26-.12-.5-.33-.66L13.5 19v-2.26l5.36 5.36c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.31 3.72z"})
                                                    "AirplanemodeInactiveRounded"))
