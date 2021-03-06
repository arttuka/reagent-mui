(ns reagent-material-ui.icons.forward-5-rounded
  "Imports @material-ui/icons/Forward5Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def forward-5-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19.93 13c-.5 0-.92.36-.98.86-.43 3.49-3.44 6.19-7.05 6.14-3.71-.05-6.84-3.18-6.9-6.9C4.94 9.2 8.11 6 12 6v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.2.2-.51 0-.71l-2.79-2.79c-.31-.31-.85-.09-.85.36V4c-5.06 0-9.14 4.17-9 9.25.13 4.7 4.04 8.61 8.74 8.74 4.7.13 8.62-3.35 9.19-7.87.07-.59-.4-1.12-1-1.12z"}) (e "path" #js {"d" "M13.25 11.5c.41 0 .75-.34.75-.75s-.34-.75-.75-.75H10.5c-.55 0-1 .45-1 1v1.5c0 .55.45 1 1 1h2v1h-2.25c-.41 0-.75.34-.75.75s.34.75.75.75H13c.55 0 1-.45 1-1v-1.5c0-.55-.45-1-1-1h-2v-1h2.25z"}))
                                        "Forward5Rounded"))
