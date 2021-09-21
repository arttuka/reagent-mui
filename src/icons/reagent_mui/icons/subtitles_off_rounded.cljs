(ns reagent-mui.icons.subtitles-off-rounded
  "Imports @mui/icons-material/SubtitlesOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subtitles-off-rounded (create-svg-icon (e "path" #js {"d" "M20 4H6.83l8 8H19c.55 0 1 .45 1 1s-.45 1-1 1h-2.17l4.93 4.93c.15-.28.24-.59.24-.93V6c0-1.1-.9-2-2-2zm0 16-6-6-1.71-1.71L12 12 3.16 3.16a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.49.49c-.15.29-.24.6-.24.94v12c0 1.1.9 2 2 2h13.17l2.25 2.25c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L20 20zM8 13c0 .55-.45 1-1 1H5c-.55 0-1-.45-1-1s.45-1 1-1h2c.55 0 1 .45 1 1zm6 4c0 .55-.45 1-1 1H5c-.55 0-1-.45-1-1s.45-1 1-1h8c.08 0 .14.03.21.04l.74.74c.02.08.05.14.05.22z"})
                                            "SubtitlesOffRounded"))
