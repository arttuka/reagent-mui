(ns reagent-mui.icons.face-retouching-natural-outlined
  "Imports @mui/icons-material/FaceRetouchingNaturalOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def face-retouching-natural-outlined (create-svg-icon [(e "path" #js {"d" "M19.89 10.75c.07.41.11.82.11 1.25 0 4.41-3.59 8-8 8s-8-3.59-8-8c0-.05.01-.1 0-.14 2.6-.98 4.69-2.99 5.74-5.55 3.38 4.14 7.97 3.73 8.99 3.61l-.89-1.93c-.13.01-4.62.38-7.18-3.86 1.01-.16 1.71-.15 2.59-.01 2.52-1.15 1.93-.89 2.76-1.26C14.78 2.3 13.43 2 12 2 6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10c0-1.43-.3-2.78-.84-4.01l-1.27 2.76zM8.08 5.03C7.45 6.92 6.13 8.5 4.42 9.47 5.05 7.58 6.37 6 8.08 5.03z"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1.25"}) (e "circle" #js {"cx" "9", "cy" "13", "r" "1.25"}) (e "path" #js {"d" "m23 4.5-2.4-1.1L19.5 1l-1.1 2.4L16 4.5l2.4 1.1L19.5 8l1.1-2.4z"})]
                                                       "FaceRetouchingNaturalOutlined"))
