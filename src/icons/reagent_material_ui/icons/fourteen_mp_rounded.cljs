(ns reagent-material-ui.icons.fourteen-mp-rounded
  "Imports @material-ui/icons/FourteenMpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fourteen-mp-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM7.75 5.5H9c.55 0 1 .45 1 1v4.25c0 .41-.34.75-.75.75s-.75-.34-.75-.75V7h-.75C7.34 7 7 6.66 7 6.25s.34-.75.75-.75zm4.75 12.25c0 .41-.34.75-.75.75s-.75-.34-.75-.75V14h-1v2.25c0 .41-.34.75-.75.75s-.75-.34-.75-.75V14h-1v3.75c0 .41-.34.75-.75.75S6 18.16 6 17.75V13.5c0-.55.45-1 1-1h4.5c.55 0 1 .45 1 1v4.25zM12 9V6.25c0-.41.34-.75.75-.75s.75.34.75.75V8.5H15V6.25c0-.41.34-.75.75-.75s.75.34.75.75V8.5h.25c.41 0 .75.34.75.75s-.34.75-.75.75h-.25v.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V10h-2c-.55 0-1-.45-1-1zm6 7c0 .55-.45 1-1 1h-2v.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V13.5c0-.55.45-1 1-1H17c.55 0 1 .45 1 1V16z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"}))
                                          "FourteenMpRounded"))
