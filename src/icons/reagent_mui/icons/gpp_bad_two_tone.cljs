(ns reagent-mui.icons.gpp-bad-two-tone
  "Imports @mui/icons-material/GppBadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gpp-bad-two-tone (create-svg-icon [(e "path" #js {"d" "M12 2 4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm6 9.09c0 4-2.55 7.7-6 8.83-3.45-1.13-6-4.82-6-8.83v-4.7l6-2.25 6 2.25v4.7zM9.91 8.5 8.5 9.91 10.59 12 8.5 14.09l1.41 1.41L12 13.42l2.09 2.08 1.41-1.41L13.42 12l2.08-2.09-1.41-1.41L12 10.59 9.91 8.5z"}) (e "path" #js {"d" "M6 6.39v4.7c0 4 2.55 7.7 6 8.83 3.45-1.13 6-4.82 6-8.83v-4.7l-6-2.25-6 2.25zm9.5 3.52L13.42 12l2.08 2.09-1.41 1.41L12 13.42 9.91 15.5 8.5 14.09 10.59 12 8.5 9.91 9.91 8.5 12 10.59l2.09-2.09 1.41 1.41z", "opacity" ".3"})]
                                       "GppBadTwoTone"))
