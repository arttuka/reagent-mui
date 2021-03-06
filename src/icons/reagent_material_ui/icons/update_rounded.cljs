(ns reagent-material-ui.icons.update-rounded
  "Imports @material-ui/icons/UpdateRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def update-rounded (create-svg-icon (e "path" #js {"d" "M11 8v4c0 .27.11.52.29.71l2.79 2.79c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-2.5-2.5V8c0-.55-.45-1-1-1-.54 0-.99.45-.99 1zm9.15-3.15l-1.31 1.31c-1.6-1.88-3.96-3.09-6.6-3.16-4.89-.12-9.1 3.86-9.24 8.74C2.86 16.83 6.94 21 12 21c4.2 0 7.72-2.88 8.72-6.76.16-.63-.33-1.24-.98-1.24-.45 0-.85.3-.96.73-.87 3.41-4.25 5.83-8.05 5.16-2.78-.49-5.04-2.71-5.58-5.47C4.26 8.94 7.68 5 12 5c2.18 0 4.12 1.02 5.41 2.59l-1.55 1.55c-.32.32-.1.86.35.86h4.29c.28 0 .5-.22.5-.5V5.21c0-.45-.54-.67-.85-.36z"})
                                     "UpdateRounded"))
