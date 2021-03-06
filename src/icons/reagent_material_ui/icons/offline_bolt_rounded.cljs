(ns reagent-material-ui.icons.offline-bolt-rounded
  "Imports @material-ui/icons/OfflineBoltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def offline-bolt-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm-.61 14.93V13.5H9.08c-.38 0-.62-.4-.44-.73l3.17-5.99c.24-.46.94-.29.94.23v3.49h2.18c.37 0 .62.4.44.73l-3.04 5.93c-.23.46-.94.29-.94-.23z"})
                                           "OfflineBoltRounded"))
