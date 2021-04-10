(ns reagent-material-ui.icons.media-bluetooth-on-two-tone
  "Imports @material-ui/icons/MediaBluetoothOnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def media-bluetooth-on-two-tone (create-svg-icon (e "path" #js {"d" "M9 3l.01 10.55c-.6-.34-1.28-.55-2-.55C4.79 13 3 14.79 3 17s1.79 4 4.01 4S11 19.21 11 17V7h4V3H9zm12 9.43L17.57 9h-.6v4.55l-2.75-2.75-.85.85L16.73 15l-3.35 3.35.85.85 2.75-2.75V21h.6L21 17.57 18.42 15 21 12.43zm-2.83-1.13l1.13 1.13-1.13 1.13V11.3zm1.13 6.27l-1.13 1.13v-2.26l1.13 1.13z"})
                                                  "MediaBluetoothOnTwoTone"))