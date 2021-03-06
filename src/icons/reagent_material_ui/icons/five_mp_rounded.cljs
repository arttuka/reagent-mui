(ns reagent-material-ui.icons.five-mp-rounded
  "Imports @material-ui/icons/FiveMpRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def five-mp-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 14h1.5v1.5H15z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-8 6c-.55 0-1-.45-1-1V6.5c0-.55.45-1 1-1h2.75c.41 0 .75.34.75.75s-.34.75-.75.75H11.5v1h2c.55 0 1 .45 1 1v1.5c0 .55-.45 1-1 1h-2.75c-.41 0-.75-.34-.75-.75s.34-.75.75-.75H13V9h-2zm1.5 8.75c0 .41-.34.75-.75.75s-.75-.33-.75-.75V14h-1v2.25c0 .42-.34.75-.75.75s-.75-.33-.75-.75V14h-1v3.75c0 .41-.34.75-.75.75S6 18.17 6 17.75V13.5c0-.55.45-1 1-1h4.5c.55 0 1 .45 1 1v4.25zM18 16c0 .55-.45 1-1 1h-2v.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75V13.5c0-.55.45-1 1-1H17c.55 0 1 .45 1 1V16z"}))
                                      "FiveMpRounded"))
