(ns reagent-material-ui.icons.seven-k-outlined
  "Imports @material-ui/icons/SevenKOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def seven-k-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M7.75 15H9.5l1.46-4.71C11.15 9.65 10.67 9 10 9H6.5v1.5h2.63L7.75 15zm6.75-2.25L16.25 15H18l-2.25-3L18 9h-1.75l-1.75 2.25V9H13v6h1.5z"}))
                                       "SevenKOutlined"))
