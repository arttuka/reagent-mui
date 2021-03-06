(ns reagent-material-ui.icons.reply-rounded
  "Imports @material-ui/icons/ReplyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def reply-rounded (create-svg-icon (e "path" #js {"d" "M16 10H9V7.41c0-.89-1.08-1.34-1.71-.71L3.7 10.29c-.39.39-.39 1.02 0 1.41l3.59 3.59c.63.63 1.71.19 1.71-.7V12h7c1.65 0 3 1.35 3 3v3c0 .55.45 1 1 1s1-.45 1-1v-3c0-2.76-2.24-5-5-5z"})
                                    "ReplyRounded"))
