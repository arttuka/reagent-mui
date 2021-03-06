(ns reagent-material-ui.icons.wb-sunny-rounded
  "Imports @material-ui/icons/WbSunnyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wb-sunny-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 1c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1s1-.45 1-1V2c0-.55-.45-1-1-1zm0 22c.55 0 1-.45 1-1v-1c0-.55-.45-1-1-1s-1 .45-1 1v1c0 .55.45 1 1 1zm8-11c0 .55.45 1 1 1h1c.55 0 1-.45 1-1s-.45-1-1-1h-1c-.55 0-1 .45-1 1zM3 11H2c-.55 0-1 .45-1 1s.45 1 1 1h1c.55 0 1-.45 1-1s-.45-1-1-1zm16.78-6.78a.9959.9959 0 0 0-1.41 0l-.37.37c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.36-.36c.4-.39.4-1.03.01-1.42zM4.22 19.78c.39.39 1.02.39 1.41 0l.37-.37c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-.36.36c-.4.39-.4 1.03-.01 1.42zM18 19.41l.36.36c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-.36-.36A.9959.9959 0 0 0 18 18c-.39.39-.39 1.02 0 1.41zM6 4.59l-.36-.37a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.36.37c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41z"}) (e "circle" #js {"cy" "12", "r" "6", "cx" "12"}))
                                       "WbSunnyRounded"))
