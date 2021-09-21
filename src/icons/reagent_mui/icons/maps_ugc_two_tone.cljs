(ns reagent-mui.icons.maps-ugc-two-tone
  "Imports @mui/icons-material/MapsUgcTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def maps-ugc-two-tone (create-svg-icon [(e "path" #js {"fillOpacity" ".3", "d" "M12 4c4.41 0 8 3.59 8 8s-3.59 8-8 8c-1.18 0-2.34-.26-3.43-.78-.27-.13-.56-.19-.86-.19-.19 0-.38.03-.56.08l-3.2.94.94-3.2c.14-.47.1-.98-.11-1.42C4.26 14.34 4 13.18 4 12c0-4.41 3.59-8 8-8"}) (e "path" #js {"d" "M12 4c4.41 0 8 3.59 8 8s-3.59 8-8 8c-1.18 0-2.34-.26-3.43-.78-.27-.13-.56-.19-.86-.19-.19 0-.38.03-.56.08l-3.2.94.94-3.2c.14-.47.1-.98-.11-1.42C4.26 14.34 4 13.18 4 12c0-4.41 3.59-8 8-8m0-2C6.48 2 2 6.48 2 12c0 1.54.36 2.98.97 4.29L1 23l6.71-1.97c1.31.61 2.75.97 4.29.97 5.52 0 10-4.48 10-10S17.52 2 12 2z"}) (e "path" #js {"fillRule" "evenodd", "d" "M13 8h-2v3H8v2h3v3h2v-3h3v-2h-3z"})]
                                        "MapsUgcTwoTone"))
