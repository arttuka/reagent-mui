(ns reagent-material-ui.icons.layers-clear-rounded
  "Imports @material-ui/icons/LayersClearRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def layers-clear-rounded (create-svg-icon (e "path" #js {"d" "M19.97 13.2a.991.991 0 0 0-1.22 0l-1.23.96 1.43 1.43 1.03-.8c.51-.4.51-1.17 0-1.57l-.01-.02zm.02-3.49c.51-.4.51-1.18 0-1.58l-6.76-5.26c-.72-.56-1.73-.56-2.46 0L8.23 4.86l7.88 7.88 3.88-3.03zm.49 10.23L3.51 2.97a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.95 2.95-1.04.81c-.51.4-.51 1.18 0 1.58l6.76 5.26c.61.48 1.43.52 2.11.18l1.47 1.47-2.36 1.84-6.77-5.26a.991.991 0 0 0-1.22 0c-.51.4-.51 1.17 0 1.57l6.76 5.26c.72.56 1.73.56 2.46 0l2.55-1.98 3.3 3.3c.39.39 1.02.39 1.41 0 .4-.39.4-1.03 0-1.42z"})
                                           "LayersClearRounded"))
