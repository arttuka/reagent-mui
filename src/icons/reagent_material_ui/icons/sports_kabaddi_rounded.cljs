(ns reagent-material-ui.icons.sports-kabaddi-rounded
  "Imports @material-ui/icons/SportsKabaddiRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-kabaddi-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "2.5", "r" "2", "cx" "16.5"}) (e "circle" #js {"cy" "6.5", "r" "2", "cx" "11.5"}) (e "path" #js {"d" "M15 12.92c0-.5-.37-.92-.87-.99-1.15-.17-2.17-.65-2.89-1.37l-2-1.98C9.08 8.42 8.62 8 7.83 8c-.51 0-1.02.2-1.41.59l-3.34 3.32c-.61.61-.7 1.49-.47 2.09l1.07 2.95-2.93 2.93c-.39.39-.39 1.02 0 1.41.39.39 1.03.39 1.42 0l3.53-3.53v-2.22L7 16.75V21c0 .55.45 1 1 1s1-.45 1-1v-5.12l-2.12-2.12 2.36-2.36.71.71c1.04 1.02 2.36 1.63 3.91 1.82.61.08 1.14-.4 1.14-1.01z"}) (e "path" #js {"d" "M24 11.01V7.97c0-.4-.24-.76-.61-.92l-4.44-1.88c-.97-.41-2.1-.06-2.66.84l-1 1.6c-.67 1.18-1.91 1.93-3.41 2.19l.04.04c.01.01.02.01.02.02.65.65 1.64 1.03 2.75 1.11.68-.4 1.3-.88 1.8-1.45L17.1 13 15 14.99V21c0 .55.45 1 1 1s1-.45 1-1v-4.51l2.1-2 1.62 6.74c.11.45.51.77.97.77h.09c.63 0 1.1-.58.98-1.19L20.2 7.91l1.8.7v2.4c0 .55.45 1 1 1s1-.45 1-1z"}))
                                             "SportsKabaddiRounded"))
