(ns reagent-material-ui.icons.playlist-add-rounded
  "Imports @material-ui/icons/PlaylistAddRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-add-rounded (create-svg-icon (e "path" #js {"d" "M13 10H4c-.55 0-1 .45-1 1s.45 1 1 1h9c.55 0 1-.45 1-1s-.45-1-1-1zm0-4H4c-.55 0-1 .45-1 1s.45 1 1 1h9c.55 0 1-.45 1-1s-.45-1-1-1zm5 8v-3c0-.55-.45-1-1-1s-1 .45-1 1v3h-3c-.55 0-1 .45-1 1s.45 1 1 1h3v3c0 .55.45 1 1 1s1-.45 1-1v-3h3c.55 0 1-.45 1-1s-.45-1-1-1h-3zM4 16h5c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1z"})
                                           "PlaylistAddRounded"))
