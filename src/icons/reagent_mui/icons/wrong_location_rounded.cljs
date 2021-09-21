(ns reagent-mui.icons.wrong-location-rounded
  "Imports @mui/icons-material/WrongLocationRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wrong-location-rounded (create-svg-icon [(e "path" #js {"d" "m20.42 4.5 1.38-1.38c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L19 3.08 17.62 1.7c-.39-.39-1.02-.39-1.41 0s-.39 1.02 0 1.41l1.38 1.38-1.38 1.38c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L19 5.92l1.38 1.38c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L20.42 4.5z"}) (e "path" #js {"d" "M19.67 8 19 7.33l-.59.59c-.7.7-1.84.88-2.65.3-1.03-.74-1.12-2.19-.26-3.05l.67-.67-.67-.67c-.36-.36-.54-.81-.57-1.28C14.01 2.19 13.02 2 12 2c-4.2 0-8 3.22-8 8.2 0 3.18 2.45 6.92 7.34 11.23.38.33.95.33 1.33 0C17.55 17.12 20 13.38 20 10.2c0-.76-.1-1.47-.26-2.14-.02-.02-.05-.04-.07-.06zM12 12c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})]
                                             "WrongLocationRounded"))
