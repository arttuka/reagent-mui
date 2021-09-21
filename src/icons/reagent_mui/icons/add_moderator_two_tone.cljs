(ns reagent-mui.icons.add-moderator-two-tone
  "Imports @mui/icons-material/AddModeratorTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-moderator-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4.14 6 6.39v4.7c0 3.33 1.76 6.44 4.33 8.04-1.56-4.89 2.5-9.8 7.67-9.05V6.39l-6-2.25z", "opacity" ".3"}) (e "path" #js {"d" "M10.33 19.13C7.76 17.53 6 14.42 6 11.09v-4.7l6-2.25 6 2.25v3.69c.71.1 1.38.31 2 .6V5l-8-3-8 3v6.09c0 5.05 3.41 9.76 8 10.91.03-.01.05-.02.08-.02-.79-.79-1.4-1.76-1.75-2.85z"}) (e "path" #js {"d" "M17 12c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm3 5.5h-2.5V20h-1v-2.5H14v-1h2.5V14h1v2.5H20v1z"})]
                                             "AddModeratorTwoTone"))
