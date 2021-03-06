(ns reagent-material-ui.icons.coffee-maker-outlined
  "Imports @material-ui/icons/CoffeeMakerOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def coffee-maker-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 6V4h2V2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h14v-2h-4.03c1.23-.91 2.03-2.36 2.03-4v-5H8v5c0 1.64.81 3.09 2.03 4H6V4h2v2c0 .55.45 1 1 1h8c.55 0 1-.45 1-1zm-8 10v-3h6v3c0 1.65-1.35 3-3 3s-3-1.35-3-3z"}) (e "circle" #js {"cy" "9", "r" "1", "cx" "13"}))
                                            "CoffeeMakerOutlined"))
