(ns reagent-material-ui.icons.important-devices-rounded
  "Imports @material-ui/icons/ImportantDevicesRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def important-devices-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M21 11.01L17 11c-.55 0-1 .45-1 1v8c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-8c0-.55-.45-.99-1-.99zM21 19h-4v-6h4v6z"}) (e "path" #js {"d" "M12 17h1c.55 0 1-.45 1-1s-.45-1-1-1H4V5h14v3c0 .55.45 1 1 1s1-.45 1-1V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h6v2H9c-.55 0-1 .45-1 1s.45 1 1 1h4c.55 0 1-.45 1-1s-.45-1-1-1h-1v-2z"}) (e "path" #js {"d" "M11.91 9.06L11 6.25l-.91 2.81H7.25l2.32 1.84-.89 2.85L11 11.99l2.32 1.76-.89-2.85 2.32-1.84z"}))
                                                "ImportantDevicesRounded"))
