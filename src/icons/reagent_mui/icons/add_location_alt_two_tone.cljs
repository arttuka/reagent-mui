(ns reagent-mui.icons.add-location-alt-two-tone
  "Imports @mui/icons-material/AddLocationAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-location-alt-two-tone (create-svg-icon [(e "path" #js {"fillOpacity" ".3", "d" "M14 4.8V7h3v3h1.41c.06.39.09.79.09 1.2 0 2.57-2.1 5.79-6.16 9.51l-.34.3-.34-.31C7.6 16.99 5.5 13.77 5.5 11.2c0-3.84 2.82-6.7 6.5-6.7.7 0 1.37.1 2 .3z"}) (e "path" #js {"d" "M20 1v3h3v2h-3v3h-2V6h-3V4h3V1h2zm-8 12c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm2-9.75v2.08c-.62-.22-1.3-.33-2-.33-3.35 0-6 2.57-6 6.2 0 2.34 1.95 5.44 6 9.14 4.05-3.7 6-6.79 6-9.14 0-.41-.03-.81-.1-1.2h2.02c.05.39.08.79.08 1.2 0 3.32-2.67 7.25-8 11.8-5.33-4.55-8-8.48-8-11.8C4 6.22 7.8 3 12 3c.68 0 1.35.08 2 .25z"})]
                                                "AddLocationAltTwoTone"))
