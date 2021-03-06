(ns reagent-material-ui.icons.local-pizza-rounded
  "Imports @material-ui/icons/LocalPizzaRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-pizza-rounded (create-svg-icon (e "path" #js {"d" "M12 3C9.02 3 6.03 4.17 3.61 5.79c-.92.61-1.18 1.86-.56 2.78l7.29 10.93c.79 1.19 2.54 1.19 3.33 0l7.29-10.93c.62-.92.36-2.17-.56-2.79C17.97 4.17 14.98 3 12 3zM8 8.5C8 7.67 8.67 7 9.5 7s1.5.67 1.5 1.5-.67 1.5-1.5 1.5S8 9.33 8 8.5zm4 6.5c-.83 0-1.5-.67-1.5-1.5S11.17 12 12 12s1.5.67 1.5 1.5S12.83 15 12 15z"})
                                          "LocalPizzaRounded"))
