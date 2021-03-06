(ns reagent-material-ui.icons.mic-off-rounded
  "Imports @material-ui/icons/MicOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mic-off-rounded (create-svg-icon (e "path" #js {"d" "M17.91 11c-.49 0-.9.36-.99.84-.1.59-.32 1.15-.61 1.65l1.45 1.45c.57-.83.97-1.78 1.14-2.81.11-.59-.38-1.13-.99-1.13zM2.1 3.51c-.39.39-.39 1.02 0 1.41l10.95 10.95c-.34.09-.69.13-1.05.13-2.47 0-4.52-1.79-4.93-4.15-.08-.49-.49-.85-.98-.85-.61 0-1.09.54-1 1.14.49 3 2.89 5.34 5.91 5.78V20c0 .55.45 1 1 1s1-.45 1-1v-2.08c.57-.08 1.12-.24 1.64-.45l4.43 4.43c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0zM15 11V5c0-1.66-1.34-3-3-3S9 3.34 9 5v1.17l5.81 5.81c.11-.31.19-.63.19-.98z"})
                                      "MicOffRounded"))
