(ns reagent-mui.icons.auto-graph-rounded
  "Imports @mui/icons-material/AutoGraphRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def auto-graph-rounded (create-svg-icon (e "path" #js {"d" "M14.06 9.94 13 9.45c-.39-.18-.39-.73 0-.91l1.06-.49.49-1.05c.18-.39.73-.39.91 0l.49 1.06 1.05.49c.39.18.39.73 0 .91l-1.06.49-.49 1.05c-.18.39-.73.39-.91 0l-.48-1.06zM4.45 13l.49-1.06L6 11.45c.39-.18.39-.73 0-.91l-1.06-.49L4.45 9c-.17-.39-.73-.39-.9 0l-.49 1.06-1.06.49c-.39.18-.39.73 0 .91l1.06.49.49 1.05c.17.39.73.39.9 0zm4.51-5.01.63-1.4 1.4-.63c.39-.18.39-.73 0-.91l-1.4-.63-.63-1.4c-.18-.39-.73-.39-.91 0l-.63 1.4-1.4.63c-.39.18-.39.73 0 .91l1.4.63.63 1.4c.17.39.73.39.91 0zm13.38.28c-.4-.4-1.07-.39-1.45.04l-6.39 7.18-3.29-3.29a.9959.9959 0 0 0-1.41 0l-6.04 6.05c-.41.41-.41 1.09 0 1.5.41.41 1.09.41 1.5 0l5.25-5.26 3.25 3.25c.41.41 1.07.39 1.45-.04l7.17-8.07c.35-.39.33-.99-.04-1.36z"})
                                         "AutoGraphRounded"))
