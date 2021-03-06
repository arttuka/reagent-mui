(ns reagent-material-ui.icons.camera-rear-rounded
  "Imports @material-ui/icons/CameraRearRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def camera-rear-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.26 15.5l1.5 1.5h4.3c1.07 0 1.94-.87 1.94-1.94V4c0-1.1-.9-1.99-2-1.99L7 2c-1.1 0-2 .9-2 2v11.06C5 16.13 5.87 17 6.94 17l1.5-1.5c.78-.78 2.04-.78 2.82 0zM12 6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2z"}) (e "path" #js {"d" "M12.64 18.29l-2.09-2.09a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.39.39H6c-.55 0-1 .45-1 1s.45 1 1 1h3.53l-.38.38c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l2.09-2.09c.38-.38.38-1.02-.01-1.41zM15 20h3c.55 0 1-.45 1-1s-.45-1-1-1h-3c-.55 0-1 .45-1 1s.45 1 1 1z"}))
                                          "CameraRearRounded"))
