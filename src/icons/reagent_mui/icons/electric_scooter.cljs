(ns reagent-mui.icons.electric-scooter
  "Imports @mui/icons-material/ElectricScooter as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-scooter (create-svg-icon [(e "path" #js {"d" "M7.82 16H15v-1c0-2.21 1.79-4 4-4h.74l-1.9-8.44C17.63 1.65 16.82 1 15.89 1H12v2h3.89l1.4 6.25h-.01c-2.16.65-3.81 2.48-4.19 4.75H7.82c-.48-1.34-1.86-2.24-3.42-1.94-1.18.23-2.13 1.2-2.35 2.38C1.7 16.34 3.16 18 5 18c1.3 0 2.4-.84 2.82-2zM5 16c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}) (e "path" #js {"d" "M19 12c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3zm0 4c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm-8 4H7l6 3v-2h4l-6-3z"})]
                                       "ElectricScooter"))
