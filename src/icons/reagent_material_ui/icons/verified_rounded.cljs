(ns reagent-material-ui.icons.verified-rounded
  "Imports @material-ui/icons/VerifiedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def verified-rounded (create-svg-icon (e "path" #js {"d" "M22.42 11.34l-1.86-2.13.26-2.82c.05-.5-.29-.96-.77-1.07l-2.76-.62-1.44-2.44c-.26-.43-.79-.61-1.26-.41L12 2.96 9.41 1.85c-.46-.2-1-.02-1.25.41L6.71 4.69l-2.75.62c-.49.11-.83.56-.78 1.06l.26 2.83-1.87 2.14c-.33.38-.33.94 0 1.32l1.87 2.13-.26 2.83c-.05.5.29.96.77 1.07l2.76.63 1.44 2.43c.26.43.8.61 1.26.41L12 21.03l2.59 1.11c.46.2 1 .02 1.25-.41l1.44-2.43 2.76-.63c.49-.11.82-.57.77-1.07l-.26-2.82 1.86-2.13c.34-.37.34-.93.01-1.31zm-12.19 3.49l-2.12-2.12a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l1.41 1.41 3.54-3.54c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-4.24 4.24c-.38.4-1.02.4-1.41.01z"})
                                       "VerifiedRounded"))
