(ns reagent-material-ui.icons.sip
  "Imports @material-ui/icons/Sip as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sip (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 10.5h2v1h-2z"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-10 6.5H6.5v.75H9c.55 0 1 .45 1 1V14c0 .55-.45 1-1 1H5v-1.5h3.5v-.75H6c-.55 0-1-.45-1-1V10c0-.55.45-1 1-1h4v1.5zm3 4.5h-2V9h2v6zm6-3c0 .55-.45 1-1 1h-2.5v2H14V9h4c.55 0 1 .45 1 1v2z"}))
                          "Sip"))
