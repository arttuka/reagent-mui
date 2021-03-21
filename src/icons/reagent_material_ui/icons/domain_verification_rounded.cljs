(ns reagent-material-ui.icons.domain-verification-rounded
  "Imports @material-ui/icons/DomainVerificationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def domain-verification-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H4V8h16v10zm-4.11-7.83a.9959.9959 0 0 0-1.41 0l-3.54 3.54-1.41-1.41a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.12 2.12c.39.39 1.02.39 1.41 0l4.24-4.24c.39-.39.39-1.03 0-1.42z"})
                                                  "DomainVerificationRounded"))