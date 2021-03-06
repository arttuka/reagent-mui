(ns reagent-material-ui.icons.bug-report-rounded
  "Imports @material-ui/icons/BugReportRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bug-report-rounded (create-svg-icon (e "path" #js {"d" "M19 8h-1.81c-.45-.78-1.07-1.45-1.82-1.96l.93-.93c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-1.47 1.47c-.56-.13-1.58-.3-2.83 0L9.11 3.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.92.93C7.88 6.55 7.26 7.22 6.81 8H5c-.55 0-1 .45-1 1s.45 1 1 1h1.09c-.11.73-.09.87-.09 2H5c-.55 0-1 .45-1 1s.45 1 1 1h1c0 1.14-.02 1.27.09 2H5c-.55 0-1 .45-1 1s.45 1 1 1h1.81c1.04 1.79 2.97 3 5.19 3s4.15-1.21 5.19-3H19c.55 0 1-.45 1-1s-.45-1-1-1h-1.09c.11-.73.09-.87.09-2h1c.55 0 1-.45 1-1s-.45-1-1-1h-1c0-1.14.02-1.27-.09-2H19c.55 0 1-.45 1-1s-.45-1-1-1zm-6 8h-2c-.55 0-1-.45-1-1s.45-1 1-1h2c.55 0 1 .45 1 1s-.45 1-1 1zm0-4h-2c-.55 0-1-.45-1-1s.45-1 1-1h2c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                         "BugReportRounded"))
