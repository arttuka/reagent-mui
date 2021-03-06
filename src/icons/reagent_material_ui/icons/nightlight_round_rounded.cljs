(ns reagent-material-ui.icons.nightlight-round-rounded
  "Imports @material-ui/icons/NightlightRoundRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def nightlight-round-rounded (create-svg-icon (e "path" #js {"d" "M15.5 22h.21c.84-.02 1.12-1.11.41-1.56-2.78-1.77-4.63-4.89-4.63-8.43 0-3.55 1.85-6.66 4.63-8.44.7-.45.44-1.54-.39-1.56h-.13c-4.9-.05-9.21 3.53-9.98 8.37C4.64 16.61 9.45 22 15.5 22z"})
                                               "NightlightRoundRounded"))
