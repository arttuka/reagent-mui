(ns reagent-material-ui.icons.arrow-circle-up-two-tone
  "Imports @material-ui/icons/ArrowCircleUpTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-circle-up-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 20c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8m-1-8v4h2v-4h3l-4-4-4 4h3z", "opacity" ".3"}) (e "path" #js {"d" "M12 20c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8m0 2c5.52 0 10-4.48 10-10S17.52 2 12 2 2 6.48 2 12s4.48 10 10 10zm-1-10v4h2v-4h3l-4-4-4 4h3z"}))
                                               "ArrowCircleUpTwoTone"))