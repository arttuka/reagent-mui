(ns reagent-material-ui.icons.text-rotate-vertical-rounded
  "Imports @material-ui/icons/TextRotateVerticalRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotate-vertical-rounded (create-svg-icon (e "path" #js {"d" "M6 5c-.55 0-1 .45-1 1v10h-.79c-.45 0-.67.54-.35.85l1.79 1.79c.2.2.51.2.71 0l1.79-1.79c.31-.31.09-.85-.36-.85H7V6c0-.55-.45-1-1-1zm10 1c-.59 0-1.12.37-1.33.92l-3.34 8.88c-.22.58.21 1.2.83 1.2.37 0 .71-.24.83-.59l.79-2.22h4.44l.78 2.22c.12.35.46.59.83.59.62 0 1.05-.62.83-1.2l-3.34-8.88C17.12 6.37 16.59 6 16 6zm-1.64 6.59l1.6-4.55h.09l1.6 4.55h-3.29z"})
                                                   "TextRotateVerticalRounded"))
