(ns reagent-material-ui.icons.sip-rounded
  "Imports @material-ui/icons/SipRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sip-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 10.5h2v1h-2z"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM10 9.75c0 .41-.34.75-.75.75H6.5v.75H9c.55 0 1 .45 1 1V14c0 .55-.45 1-1 1H5.75c-.41 0-.75-.34-.75-.75s.34-.75.75-.75H8.5v-.75H6c-.55 0-1-.45-1-1V10c0-.55.45-1 1-1h3.25c.41 0 .75.34.75.75zM12 15c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1s1 .45 1 1v4c0 .55-.45 1-1 1zm7-3c0 .55-.45 1-1 1h-2.5v1.25c0 .41-.34.75-.75.75s-.75-.34-.75-.75V10c0-.55.45-1 1-1h3c.55 0 1 .45 1 1v2z"}))
                                  "SipRounded"))
