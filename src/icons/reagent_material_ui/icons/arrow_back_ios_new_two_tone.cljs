(ns reagent-material-ui.icons.arrow-back-ios-new-two-tone
  "Imports @material-ui/icons/ArrowBackIosNewTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-back-ios-new-two-tone (create-svg-icon (e "path" #js {"d" "M17.77 3.77L16 2 6 12l10 10 1.77-1.77L9.54 12z"})
                                                  "ArrowBackIosNewTwoTone"))