(ns reagent-mui.icons.add-to-home-screen-rounded
  "Imports @mui/icons-material/AddToHomeScreenRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-to-home-screen-rounded (create-svg-icon (e "path" #js {"d" "M18 1.01 8 1c-1.1 0-2 .9-2 2v3c0 .55.45 1 1 1s1-.45 1-1V5h10v14H8v-1c0-.55-.45-1-1-1s-1 .45-1 1v3c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM11 15c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1H6c-.55 0-1 .45-1 1s.45 1 1 1h2.59L3.7 14.89c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L10 11.41V14c0 .55.45 1 1 1z"})
                                                 "AddToHomeScreenRounded"))
