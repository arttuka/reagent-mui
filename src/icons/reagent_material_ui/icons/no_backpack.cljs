(ns reagent-material-ui.icons.no-backpack
  "Imports @material-ui/icons/NoBackpack as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-backpack (create-svg-icon (e "path" #js {"d" "M21.19 21.19L2.81 2.81 1.39 4.22l2.76 2.76C4.06 7.31 4 7.64 4 8v12c0 1.1.9 2 2 2h12c.34 0 .65-.09.93-.24l.85.85 1.41-1.42zM6 14v-2h3.17l2 2H6zm8.83-2L6.98 4.15c.01 0 .01-.01.02-.01V2h3v2h4V2h3v2.14c1.72.45 3 2 3 3.86v9.17l-2-2V12h-3.17z"})
                                  "NoBackpack"))