(ns reagent-material-ui.icons.four-k-plus-two-tone
  "Imports @material-ui/icons/FourKPlusTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def four-k-plus-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14v-6.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19V5H5v14zm6.5-10H13v2.25L14.75 9h1.75l-2.25 3 2.25 3h-1.75L13 12.75V15h-1.5V9zm-6 0H7v3h1.5V9H10v3h1v1.5h-1V15H8.5v-1.5h-3V9z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 8.5h-1.5V10h-1v1.5H15v1h1.5V14h1v-1.5H19V19H5V5h14v6.5z"}) (e "path" #js {"d" "M8.5 15H10v-1.5h1V12h-1V9H8.5v3H7V9H5.5v4.5h3zm4.5-2.25L14.75 15h1.75l-2.25-3 2.25-3h-1.75L13 11.25V9h-1.5v6H13z"}))
                                           "FourKPlusTwoTone"))
