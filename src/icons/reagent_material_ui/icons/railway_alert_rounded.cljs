(ns reagent-material-ui.icons.railway-alert-rounded
  "Imports @material-ui/icons/RailwayAlertRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def railway-alert-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 11V8h7.29c-.77-2.6.21-4.61.37-4.97C2.97 2.67 2 5.02 2 7v9.5C2 18.43 3.57 20 5.5 20l-1.21.81c-.18.12-.29.32-.29.54 0 .36.29.65.65.65h10.7c.36 0 .65-.29.65-.65 0-.22-.11-.42-.29-.54L14.5 20c1.93 0 3.5-1.57 3.5-3.5V13c-1.91 0-3.63-.76-4.89-2H4zm6 6c-.83 0-1.5-.67-1.5-1.5S9.17 14 10 14s1.5.67 1.5 1.5S10.83 17 10 17z"}) (e "path" #js {"d" "M18 1c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm0 8c-.28 0-.5-.22-.5-.5s.22-.5.5-.5.5.22.5.5-.22.5-.5.5zm.5-2.5c0 .28-.22.5-.5.5s-.5-.22-.5-.5v-3c0-.28.22-.5.5-.5s.5.22.5.5v3z"}))
                                            "RailwayAlertRounded"))
