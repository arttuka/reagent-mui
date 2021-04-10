(ns reagent-material-ui.icons.thumb-down-off-alt-two-tone
  "Imports @material-ui/icons/ThumbDownOffAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def thumb-down-off-alt-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 12v2h9l-1.34 5.34L15 15V5H6z", "opacity" ".3"}) (e "path" #js {"d" "M19 3h4v12h-4zm-4 0H6c-.83 0-1.54.5-1.84 1.22l-3.02 7.05c-.09.23-.14.47-.14.73v2c0 1.1.9 2 2 2h6.31l-.95 4.57-.03.32c0 .41.17.79.44 1.06L9.83 23l6.59-6.59c.36-.36.58-.86.58-1.41V5c0-1.1-.9-2-2-2zm0 12l-4.34 4.34L12 14H3v-2l3-7h9v10z"}))
                                                  "ThumbDownOffAltTwoTone"))