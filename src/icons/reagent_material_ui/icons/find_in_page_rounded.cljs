(ns reagent-material-ui.icons.find-in-page-rounded
  "Imports @material-ui/icons/FindInPageRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def find-in-page-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14.02 16.43c-.8.47-1.77.7-2.82.48-1.64-.34-2.95-1.72-3.17-3.38-.34-2.63 1.87-4.85 4.5-4.5 1.66.22 3.04 1.52 3.38 3.17.22 1.05-.01 2.02-.48 2.82L20 19.59V8.72c0-.47-.16-.92-.46-1.28L15.6 2.72c-.38-.46-.94-.72-1.54-.72H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c.45 0 .85-.15 1.19-.4l-5.17-5.17z"}) (e "circle" #js {"cy" "13", "r" "2", "cx" "12"}))
                                           "FindInPageRounded"))
