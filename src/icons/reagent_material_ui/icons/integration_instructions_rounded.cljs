(ns reagent-material-ui.icons.integration-instructions-rounded
  "Imports @material-ui/icons/IntegrationInstructionsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def integration-instructions-rounded (create-svg-icon (e "path" #js {"d" "M19 3h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-8.71 10.46c.39.39.39 1.02 0 1.41-.39.39-1.03.39-1.42 0L6.7 12.7a.9959.9959 0 0 1 0-1.41l2.17-2.17c.39-.39 1.03-.39 1.42 0 .39.39.39 1.02 0 1.41L8.83 12l1.46 1.46zM12 4.25c-.41 0-.75-.34-.75-.75s.34-.75.75-.75.75.34.75.75-.34.75-.75.75zm5.29 8.46l-2.17 2.17c-.39.39-1.03.39-1.42 0a.9959.9959 0 0 1 0-1.41L15.17 12l-1.47-1.47a.9959.9959 0 0 1 0-1.41c.39-.39 1.03-.39 1.42 0l2.17 2.17c.39.39.39 1.03 0 1.42z"})
                                                       "IntegrationInstructionsRounded"))
