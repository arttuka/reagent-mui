(ns reagent-material-ui.icons.system-security-update-rounded
  "Imports @material-ui/icons/SystemSecurityUpdateRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-security-update-rounded (create-svg-icon (e "path" #js {"d" "M17 1.01L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 18H7V6h10v12zm-2.21-5.79H13V9c0-.55-.45-1-1-1s-1 .45-1 1v3.21H9.21c-.45 0-.67.54-.35.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.31-.31.09-.85-.36-.85z"})
                                                     "SystemSecurityUpdateRounded"))
