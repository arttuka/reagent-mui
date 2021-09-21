(ns reagent-mui.icons.cancel-schedule-send-rounded
  "Imports @mui/icons-material/CancelScheduleSendRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cancel-schedule-send-rounded (create-svg-icon [(e "path" #js {"d" "M16.5 9c-.42 0-.83.04-1.24.11L2.4 3.6c-.66-.29-1.39.2-1.39.91L1 9.2c0 .47.33.88.78.98L10 12l-8.22 1.83c-.45.1-.78.5-.78.97l.01 4.68c0 .72.73 1.2 1.39.92l6.68-2.86C9.59 21.19 12.71 24 16.5 24c4.14 0 7.5-3.36 7.5-7.5S20.64 9 16.5 9zm0 13c-3.03 0-5.5-2.47-5.5-5.5s2.47-5.5 5.5-5.5 5.5 2.47 5.5 5.5-2.47 5.5-5.5 5.5z"}) (e "path" #js {"d" "M18.62 14.38c-.2-.2-.51-.2-.71 0l-1.41 1.41-1.41-1.41c-.2-.2-.51-.2-.71 0s-.2.51 0 .71l1.41 1.41-1.41 1.41c-.2.2-.2.51 0 .71.2.2.51.2.71 0l1.41-1.41 1.41 1.41c.2.2.51.2.71 0 .2-.2.2-.51 0-.71l-1.41-1.41 1.41-1.41c.2-.2.2-.52 0-.71z"})]
                                                   "CancelScheduleSendRounded"))
