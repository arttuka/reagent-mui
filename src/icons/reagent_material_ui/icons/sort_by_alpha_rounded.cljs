(ns reagent-material-ui.icons.sort-by-alpha-rounded
  "Imports @material-ui/icons/SortByAlphaRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sort-by-alpha-rounded (create-svg-icon (e "path" #js {"d" "M11.17 15.7L8.29 8.02C8.06 7.4 7.48 7 6.83 7c-.66 0-1.24.41-1.47 1.02L2.49 15.7c-.24.63.23 1.3.9 1.3.41 0 .77-.26.91-.65l.61-1.74h3.83l.6 1.74c.15.39.52.65.93.65.67 0 1.14-.67.9-1.3zm-5.65-2.82l1.25-3.71h.11l1.24 3.71h-2.6zm10.41 2.33l4.7-5.93a1.4084 1.4084 0 0 0-1.1-2.29H14.8c-.49 0-.89.4-.89.89s.4.89.89.89h3.95l-4.76 5.92a1.4084 1.4084 0 0 0 1.1 2.29h5.02c.49.02.89-.38.89-.87s-.4-.89-.89-.89h-4.18zM11.65 2.35l-1.8 1.8c-.31.31-.09.85.36.85h3.59c.45 0 .67-.54.35-.85l-1.79-1.79c-.2-.2-.52-.2-.71-.01zm.7 19.3l1.79-1.79c.31-.31.09-.85-.35-.85H10.2c-.45 0-.67.54-.35.85l1.79 1.79c.2.19.52.19.71 0z"})
                                            "SortByAlphaRounded"))
