(ns reagent-material-ui.icons.subscript-rounded
  "Imports @material-ui/icons/SubscriptRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subscript-rounded (create-svg-icon (e "path" #js {"d" "M10.52 10.73L7.3 5.72C6.82 4.97 7.35 4 8.23 4c.39 0 .74.2.95.53l2.76 4.46h.12l2.74-4.45c.21-.34.57-.54.96-.54.88 0 1.42.98.94 1.72l-3.23 5 3.55 5.55c.48.75-.06 1.73-.94 1.73-.38 0-.74-.2-.95-.52l-3.07-4.89h-.12l-3.07 4.89c-.2.32-.56.52-.95.52-.88 0-1.42-.97-.94-1.72l3.54-5.55zM23 19.5c0-.28-.22-.5-.5-.5H20v-1h2c.55 0 1-.45 1-1v-1c0-.55-.45-1-1-1h-2.5c-.28 0-.5.22-.5.5s.22.5.5.5H22v1h-2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1h2.5c.28 0 .5-.22.5-.5z"})
                                        "SubscriptRounded"))