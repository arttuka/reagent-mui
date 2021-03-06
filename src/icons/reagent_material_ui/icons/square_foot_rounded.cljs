(ns reagent-material-ui.icons.square-foot-rounded
  "Imports @material-ui/icons/SquareFootRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def square-foot-rounded (create-svg-icon (e "path" #js {"d" "M19.68 19.14l-1.97-1.97-1.33 1.33-.71-.71L17 16.46l-2.59-2.59-1.33 1.33-.71-.71 1.33-1.33-2.59-2.59-1.33 1.33-.71-.71 1.33-1.33-2.6-2.6-1.33 1.33-.7-.7L7.1 6.56 4.86 4.32C4.64 4.1 4.37 4 4.1 4 3.54 4 3 4.44 3 5.09v13.73c0 1.2.98 2.18 2.18 2.18h13.73c.97 0 1.46-1.17.77-1.86zM6 18V9.7l8.3 8.3H6z"})
                                          "SquareFootRounded"))
