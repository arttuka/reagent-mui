(ns reagent-mui.icons.coffee-maker
  "Imports @mui/icons-material/CoffeeMaker as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def coffee-maker (create-svg-icon [(e "path" #js {"d" "M18 6V4h2V2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h14v-2h-4.03c1.23-.91 2.03-2.36 2.03-4v-5H8v5c0 1.64.81 3.09 2.03 4H6V4h2v2c0 .55.45 1 1 1h8c.55 0 1-.45 1-1z"}) (e "circle" #js {"cx" "13", "cy" "9", "r" "1"})]
                                   "CoffeeMaker"))