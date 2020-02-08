(ns reagent-material-ui.icons.text-rotate-vertical-outlined
  "Imports @material-ui/icons/TextRotateVerticalOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotate-vertical-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "m0 0h24v24H0V0z", "fill" "none"}) (e "path" #js {"d" "M15.75 5h-1.5L9.5 16h2.1l.9-2.2h5l.9 2.2h2.1L15.75 5zm-2.62 7L15 6.98 16.87 12h-3.74zM6 20l3-3H7V4H5v13H3l3 3z"}))
                                                    "TextRotateVerticalOutlined"))