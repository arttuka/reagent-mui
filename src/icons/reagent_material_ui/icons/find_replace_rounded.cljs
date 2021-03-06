(ns reagent-material-ui.icons.find-replace-rounded
  "Imports @material-ui/icons/FindReplaceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def find-replace-rounded (create-svg-icon (e "path" #js {"d" "M16.6 15.18c.41-.56.75-1.17.99-1.84.23-.65-.24-1.34-.94-1.34-.42 0-.79.26-.93.66C15.03 14.6 13.18 16 11 16c-1.38 0-2.62-.57-3.52-1.48l1.67-1.67c.31-.31.09-.85-.36-.85H4.5c-.28 0-.5.22-.5.5v4.29c0 .45.54.67.85.35l1.2-1.2C7.32 17.21 9.07 18 11 18c1.57 0 3.02-.52 4.19-1.4l3.69 3.69c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.69-3.7zM11 6c1.38 0 2.62.57 3.52 1.48l-1.67 1.67c-.31.31-.09.85.36.85h4.29c.28 0 .5-.22.5-.5V5.21c0-.45-.54-.67-.85-.35l-1.2 1.2C14.68 4.79 12.93 4 11 4 7.96 4 5.38 5.94 4.42 8.64c-.24.66.23 1.36.93 1.36.42 0 .79-.26.93-.66C6.97 7.4 8.82 6 11 6z"})
                                           "FindReplaceRounded"))
