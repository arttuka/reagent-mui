(ns reagent-mui.icons.computer-two-tone
  "Imports @mui/icons-material/ComputerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def computer-two-tone (create-svg-icon [(e "path" #js {"d" "M4 6h16v10H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 18c1.1 0 1.99-.9 1.99-2L22 6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2H0v2h24v-2h-4zM4 6h16v10H4V6z"})]
                                        "ComputerTwoTone"))
