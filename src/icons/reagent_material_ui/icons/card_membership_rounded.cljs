(ns reagent-material-ui.icons.card-membership-rounded
  "Imports @material-ui/icons/CardMembershipRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def card-membership-rounded (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h4v3.38c0 .74.78 1.23 1.45.89L12 20l2.55 1.28c.66.33 1.45-.15 1.45-.89V17h4c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 13H4v-2h16v2zm0-5H4V4h16v6z"})
                                              "CardMembershipRounded"))
