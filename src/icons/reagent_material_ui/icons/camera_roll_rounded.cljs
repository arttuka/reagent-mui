(ns reagent-material-ui.icons.camera-roll-rounded
  "Imports @material-ui/icons/CameraRollRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def camera-roll-rounded (create-svg-icon (e "path" #js {"d" "M14 5c0-1.1-.9-2-2-2h-1V2c0-.55-.45-1-1-1H6c-.55 0-1 .45-1 1v1H4c-1.1 0-2 .9-2 2v15c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2h6c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2h-6zm-3 12H9v-2h2v2zm0-7H9V8h2v2zm4 7h-2v-2h2v2zm0-7h-2V8h2v2zm4 7h-2v-2h2v2zm0-7h-2V8h2v2z"})
                                          "CameraRollRounded"))
