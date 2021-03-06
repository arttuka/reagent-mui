(ns reagent-material-ui.icons.filter-frames-rounded
  "Imports @material-ui/icons/FilterFramesRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-frames-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 9v8c0 .55.45 1 1 1h10c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1z"}) (e "path" #js {"d" "M20 4h-4L12.71.71a.9959.9959 0 0 0-1.41 0L8 4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 16H4V6h4.52l3.52-3.5L15.52 6H20v14z"}))
                                            "FilterFramesRounded"))
