(ns reagent-material-ui.icons.directions-bus-filled-two-tone
  "Imports @material-ui/icons/DirectionsBusFilledTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def directions-bus-filled-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 15c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2v-3H6v3zm9.5-2c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-7 0c.83 0 1.5.67 1.5 1.5S9.33 16 8.5 16 7 15.33 7 14.5 7.67 13 8.5 13zM12 4c-3.52 0-4.97.48-5.57 1h11.24c-.54-.54-1.96-1-5.67-1z", "opacity" ".3"}) (e "path" #js {"d" "M12 2c-4 0-8 .5-8 4v9.5c0 .95.38 1.81 1 2.44V20c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h8v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-2.06c.62-.63 1-1.49 1-2.44V6c0-3.5-3.58-4-8-4zm0 2c3.71 0 5.13.46 5.67 1H6.43c.6-.52 2.05-1 5.57-1zm6 11c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2v-3h12v3zm0-5H6V7h12v3z"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "8.5"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "15.5"}))
                                                     "DirectionsBusFilledTwoTone"))
