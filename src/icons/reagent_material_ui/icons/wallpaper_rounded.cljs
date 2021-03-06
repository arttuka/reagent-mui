(ns reagent-material-ui.icons.wallpaper-rounded
  "Imports @material-ui/icons/WallpaperRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wallpaper-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5h5c.55 0 1-.45 1-1s-.45-1-1-1H5c-1.1 0-2 .9-2 2v5c0 .55.45 1 1 1s1-.45 1-1V5z"}) (e "circle" #js {"cy" "8.5", "r" "1.5", "cx" "15.5"}) (e "path" #js {"d" "M19 3h-5c-.55 0-1 .45-1 1s.45 1 1 1h5v5c0 .55.45 1 1 1s1-.45 1-1V5c0-1.1-.9-2-2-2zM4 13c-.55 0-1 .45-1 1v5c0 1.1.9 2 2 2h5c.55 0 1-.45 1-1s-.45-1-1-1H5v-5c0-.55-.45-1-1-1zm15 6h-5c-.55 0-1 .45-1 1s.45 1 1 1h5c1.1 0 2-.9 2-2v-5c0-.55-.45-1-1-1s-1 .45-1 1v5z"}) (e "path" #js {"d" "M8.6 13.53l-2 2.67c-.25.33-.01.8.4.8h10c.41 0 .65-.47.4-.8l-2.75-3.67c-.2-.27-.6-.27-.8 0L11.25 16 9.4 13.53c-.2-.26-.6-.26-.8 0z"}))
                                        "WallpaperRounded"))
