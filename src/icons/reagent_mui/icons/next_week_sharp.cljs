(ns reagent-mui.icons.next-week-sharp
  "Imports @mui/icons-material/NextWeekSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def next-week-sharp (create-svg-icon (e "path" #js {"d" "M22 7h-6V5c0-.55-.22-1.05-.59-1.41C15.05 3.22 14.55 3 14 3h-4c-1.1 0-2 .9-2 2v2H2v15h20V7zM10 5h4v2h-4V5zm1 13.5-1-1 3-3-3-3 1-1 4 4-4 4z"})
                                      "NextWeekSharp"))
