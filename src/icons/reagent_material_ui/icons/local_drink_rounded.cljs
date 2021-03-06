(ns reagent-material-ui.icons.local-drink-rounded
  "Imports @material-ui/icons/LocalDrinkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-drink-rounded (create-svg-icon (e "path" #js {"d" "M4.12 2c-.6 0-1.06.52-.99 1.11l1.89 17.12C5.13 21.23 5.97 22 7 22h10c1.03 0 1.87-.77 1.99-1.77l1.89-17.12c.06-.59-.4-1.11-1-1.11H4.12zM12 19c-1.58 0-2.86-1.28-2.86-2.86 0-1.24 1.22-3.06 2.07-4.17.4-.52 1.18-.52 1.58 0 .85 1.11 2.07 2.92 2.07 4.17 0 1.58-1.28 2.86-2.86 2.86zm6.33-11H5.67l-.44-4h13.53l-.43 4z"})
                                          "LocalDrinkRounded"))
