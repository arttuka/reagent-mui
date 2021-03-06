(ns reagent-material-ui.icons.more-time-rounded
  "Imports @material-ui/icons/MoreTimeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def more-time-rounded (create-svg-icon (e "path" #js {"d" "M12 8c0-.55-.45-1-1-1s-1 .45-1 1v4c0 .27.11.52.29.71l2.79 2.79c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-2.5-2.5V8zm10-4h-2V2c0-.55-.45-1-1-1s-1 .45-1 1v2h-2c-.55 0-1 .45-1 1s.45 1 1 1h2v2c0 .55.45 1 1 1s1-.45 1-1V6h2c.55 0 1-.45 1-1s-.45-1-1-1zm-3 7c-.55 0-1 .45-1 1 0 3.86-3.14 7-7 7s-7-3.14-7-7 3.14-7 7-7c.3 0 .59.02.88.05.55.08 1.05-.32 1.11-.87.07-.55-.32-1.05-.87-1.11C11.75 3.02 11.37 3 11 3c-4.96 0-9 4.04-9 9s4.04 9 9 9 9-4.04 9-9c0-.55-.45-1-1-1z"})
                                        "MoreTimeRounded"))
