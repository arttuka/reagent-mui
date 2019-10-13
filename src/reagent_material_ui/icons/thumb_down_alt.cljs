(ns reagent-material-ui.icons.thumb-down-alt
  "Imports @material-ui/icons/ThumbDownAlt as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def thumb-down-alt (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 24H0V0h24v24z", "fill" "none"}) (e "path" #js {"d" "M22 4h-2c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h2V4zM2.17 11.12c-.11.25-.17.52-.17.8V13c0 1.1.9 2 2 2h5.5l-.92 4.65c-.05.22-.02.46.08.66.23.45.52.86.88 1.22L10 22l6.41-6.41c.38-.38.59-.89.59-1.42V6.34C17 5.05 15.95 4 14.66 4h-8.1c-.71 0-1.36.37-1.72.97l-2.67 6.15z"}))
                                     "ThumbDownAlt"))