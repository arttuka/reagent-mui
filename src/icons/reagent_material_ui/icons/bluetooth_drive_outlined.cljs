(ns reagent-material-ui.icons.bluetooth-drive-outlined
  "Imports @material-ui/icons/BluetoothDriveOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bluetooth-drive-outlined (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "6.5"}) (e "circle" #js {"cy" "14.5", "r" "1.5", "cx" "15.5"}) (e "path" #js {"d" "M18 17H4v-5h11v-2H4.81l1.04-3H15V5H5.5c-.66 0-1.21.42-1.42 1.01L2 12v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8h-2v5z"}) (e "path" #js {"d" "M22 3.85L19.15 1h-.5v3.79l-2.3-2.29-.7.7L18.44 6l-2.79 2.79.7.71 2.3-2.3V11h.5L22 8.14 19.85 6 22 3.85zm-2.35-.94l.94.94-.94.94V2.91zm.94 5.23l-.94.94V7.2l.94.94z"}))
                                               "BluetoothDriveOutlined"))