(ns reagent-mui.icons.text-rotation-angledown-rounded
  "Imports @mui/icons-material/TextRotationAngledownRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-rotation-angledown-rounded (create-svg-icon (e "path" #js {"d" "M15 20.5v-2.54c0-.45-.54-.67-.85-.35l-.56.56L5.1 9.68a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l8.49 8.49-.56.56c-.32.32-.1.86.34.86h2.54c.28 0 .5-.23.5-.5zM11.25 8.48l3.54 3.54-.67 1.6c-.15.36-.07.77.21 1.05.49.49 1.31.32 1.57-.32l3.61-9.09c.17-.42.07-.91-.25-1.23-.32-.32-.8-.42-1.23-.25l-9.1 3.6c-.64.25-.81 1.08-.32 1.57.27.27.68.35 1.04.2l1.6-.67zm6.59-3.05-2.23 4.87-2.64-2.64 4.87-2.23z"})
                                                      "TextRotationAngledownRounded"))
