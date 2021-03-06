(ns reagent-material-ui.icons.youtube-searched-for-rounded
  "Imports @material-ui/icons/YoutubeSearchedForRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def youtube-searched-for-rounded (create-svg-icon (e "path" #js {"d" "M21.75 18.34l-5.01-5.01c1.01-1.39 1.5-3.18 1.13-5.1-.51-2.69-2.77-4.81-5.49-5.17C8.58 2.55 5.3 5.36 5.03 9H3.21c-.45 0-.67.54-.36.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.32-.31.1-.85-.35-.85H7.05c.28-2.46 2.52-4.34 5.13-3.95 1.81.27 3.33 1.67 3.71 3.46.63 2.91-1.59 5.49-4.39 5.49-.49 0-.96-.09-1.4-.23-.35-.12-.74-.01-1 .25-.53.53-.32 1.43.38 1.66.64.21 1.32.32 2.02.32 1.43 0 2.75-.47 3.83-1.26l5.01 5.01c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41z"})
                                                   "YoutubeSearchedForRounded"))
