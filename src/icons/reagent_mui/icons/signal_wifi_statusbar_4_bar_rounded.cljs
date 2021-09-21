(ns reagent-mui.icons.signal-wifi-statusbar-4-bar-rounded
  "Imports @mui/icons-material/SignalWifiStatusbar4BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-statusbar-4-bar-rounded (create-svg-icon (e "path" #js {"d" "M12 4C7.7 4 3.78 5.6.79 8.24.35 8.63.32 9.3.73 9.71l10.56 10.58c.39.39 1.02.39 1.42 0L23.27 9.71c.41-.41.38-1.08-.06-1.47C20.22 5.6 16.3 4 12 4z"})
                                                          "SignalWifiStatusbar4BarRounded"))
