(ns reagent-material-ui.icons.star-purple-500-rounded
  "Imports @material-ui/icons/StarPurple500Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def star-purple-500-rounded (create-svg-icon (e "path" #js {"d" "M12 8.89l.94 3.11h2.82l-2.27 1.62.93 3.01L12 14.79l-2.42 1.84.93-3.01L8.24 12h2.82L12 8.89M9.58 10H5.12c-.97 0-1.37 1.25-.58 1.81l3.64 2.6-1.43 4.61c-.29.93.79 1.68 1.56 1.09l3.69-2.8 3.69 2.81c.77.59 1.85-.16 1.56-1.09l-1.43-4.61 3.64-2.6c.79-.57.39-1.81-.58-1.81h-4.46l-1.47-4.84c-.29-.95-1.63-.95-1.91 0L9.58 10z"})
                                              "StarPurple500Rounded"))
