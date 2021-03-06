(ns reagent-material-ui.icons.playlist-add-check
  "Imports @material-ui/icons/PlaylistAddCheck as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def playlist-add-check (create-svg-icon (e "path" #js {"d" "M3 10h11v2H3zm0-4h11v2H3zm0 8h7v2H3zm17.59-2.07l-4.25 4.24-2.12-2.12-1.41 1.41L16.34 19 22 13.34z"})
                                         "PlaylistAddCheck"))
