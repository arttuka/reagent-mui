(ns reagent-material-ui.icons.auto-fix-off-two-tone
  "Imports @material-ui/icons/AutoFixOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-fix-off-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4.4169 18.1737l5.4659-5.4659 1.4142 1.4142-5.466 5.466z", "opacity" ".3"}) (e "path" #js {"d" "M20 7l.94-2.06L23 4l-2.06-.94L20 1l-.94 2.06L17 4l2.06.94zm-5.83 1.42l1.41 1.41-1.46 1.46 1.41 1.41 2.17-2.17c.39-.39.39-1.02 0-1.41l-2.83-2.83c-.19-.19-.44-.29-.7-.29-.26 0-.51.1-.71.29l-2.17 2.17 1.41 1.41 1.47-1.45zM2.81 2.81L1.39 4.22l7.07 7.07-6.17 6.17c-.39.39-.39 1.02 0 1.41l2.83 2.83c.2.2.45.3.71.3s.51-.1.71-.29l6.17-6.17 7.07 7.07 1.41-1.41L2.81 2.81zm3.02 16.78l-1.41-1.41 5.46-5.46 1.41 1.41-5.46 5.46z"}))
                                            "AutoFixOffTwoTone"))
