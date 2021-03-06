(ns reagent-material-ui.icons.how-to-vote-rounded
  "Imports @material-ui/icons/HowToVoteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def how-to-vote-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 12.18l-1.5 1.64 2 2.18h-13l2-2.18L6 12.18l-3 3.27V20c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-4.54l-3-3.28z"}) (e "path" #js {"d" "M10.59 14.42c.78.79 2.05.8 2.84.01l4.98-4.98c.78-.78.78-2.05 0-2.83l-3.54-3.53c-.78-.78-2.05-.78-2.83 0L7.09 8.04c-.78.78-.78 2.03-.01 2.82l3.51 3.56zm2.87-9.92l3.53 3.53-4.94 4.94-3.53-3.53 4.94-4.94z"}))
                                          "HowToVoteRounded"))
