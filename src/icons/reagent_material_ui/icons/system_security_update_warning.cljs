(ns reagent-material-ui.icons.system-security-update-warning
  "Imports @material-ui/icons/SystemSecurityUpdateWarning as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-security-update-warning (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 15h2v2h-2zm0-8h2v6h-2z"}) (e "path" #js {"d" "M17 1H7c-1.1 0-1.99.9-1.99 2v18c0 1.1.89 2 1.99 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 17H7V6h10v12z"}))
                                                     "SystemSecurityUpdateWarning"))
