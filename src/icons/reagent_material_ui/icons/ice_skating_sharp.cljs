(ns reagent-material-ui.icons.ice-skating-sharp
  "Imports @material-ui/icons/IceSkatingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def ice-skating-sharp (create-svg-icon (e "path" #js {"d" "M21 17c0 1.66-1.34 3-3 3h-2v-2h3l-.01-6-5.71-1.43c-.88-.22-1.58-.81-1.96-1.57H8V8h3.02L11 7H8V6h3V3H3v15h3v2H2v2h16c2.76 0 5-2.24 5-5h-2zm-7 3H8v-2h6v2z"})
                                        "IceSkatingSharp"))
