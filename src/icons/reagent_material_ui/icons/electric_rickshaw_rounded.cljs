(ns reagent-material-ui.icons.electric-rickshaw-rounded
  "Imports @material-ui/icons/ElectricRickshawRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def electric-rickshaw-rounded (create-svg-icon (e "path" #js {"d" "M21 11.18V9.72c0-.47-.16-.92-.46-1.28L16.6 3.72c-.38-.46-.94-.72-1.54-.72H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h.18C3.6 16.16 4.7 17 6 17s2.4-.84 2.82-2h8.37c.41 1.16 1.51 2 2.82 2 1.66 0 3-1.34 3-3-.01-1.3-.85-2.4-2.01-2.82zM18.4 9H16V6.12L18.4 9zM3 5h4v4H3V5zm3 10c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm3-2v-2h2c.55 0 1-.45 1-1s-.45-1-1-1H9V5h5v8H9zm11 2c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zM7 20h4v-2l6 3h-4v2z"})
                                                "ElectricRickshawRounded"))
