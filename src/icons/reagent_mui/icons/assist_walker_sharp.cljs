(ns reagent-mui.icons.assist-walker-sharp
  "Imports @mui/icons-material/AssistWalkerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assist-walker-sharp (create-svg-icon [(e "circle" #js {"cx" "12.5", "cy" "4.5", "r" "2"}) (e "path" #js {"d" "M19.77 17.72 19 10h-3c-1.5-.02-2.86-.54-3.76-1.44l-2-1.98C10.08 6.42 9.62 6 8.83 6c-.51 0-1.02.2-1.41.59l-4.2 4.17 2.08 4.07-3.15 4.05 1.57 1.24 3.68-4.73-.17-1.36.77.72V20h2v-6.12l-2.12-2.12 2.36-2.36c.94.94 1.72 1.82 3.59 2.32L13 20h1.5l.41-3.5h3.18l.14 1.22c-.44.26-.73.74-.73 1.28 0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5c0-.54-.29-1.02-.73-1.28zM15.09 15l.41-3.5h2l.41 3.5h-2.82z"})]
                                          "AssistWalkerSharp"))