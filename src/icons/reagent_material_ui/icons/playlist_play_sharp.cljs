(ns reagent-material-ui.icons.playlist-play-sharp
  "Imports @material-ui/icons/PlaylistPlaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-play-sharp (create-svg-icon (e "path" #js {"d" "M3 10h11v2H3zm0-4h11v2H3zm0 8h7v2H3zm13-1v8l6-4z"})
                                          "PlaylistPlaySharp"))
