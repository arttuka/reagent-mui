(ns reagent-mui.icons.auto-fix-high-rounded
  "Imports @mui/icons-material/AutoFixHighRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def auto-fix-high-rounded (create-svg-icon (e "path" #js {"d" "m20.45 6 .49-1.06L22 4.45c.39-.18.39-.73 0-.91l-1.06-.49L20.45 2c-.18-.39-.73-.39-.91 0l-.49 1.06-1.05.49c-.39.18-.39.73 0 .91l1.06.49.49 1.05c.17.39.73.39.9 0zM8.95 6l.49-1.06 1.06-.49c.39-.18.39-.73 0-.91l-1.06-.48L8.95 2c-.17-.39-.73-.39-.9 0l-.49 1.06-1.06.49c-.39.18-.39.73 0 .91l1.06.49L8.05 6c.17.39.73.39.9 0zm10.6 7.5-.49 1.06-1.06.49c-.39.18-.39.73 0 .91l1.06.49.49 1.06c.18.39.73.39.91 0l.49-1.06 1.05-.5c.39-.18.39-.73 0-.91l-1.06-.49-.49-1.06c-.17-.38-.73-.38-.9.01zm-1.84-4.38-2.83-2.83a.9959.9959 0 0 0-1.41 0L2.29 17.46c-.39.39-.39 1.02 0 1.41l2.83 2.83c.39.39 1.02.39 1.41 0L17.7 10.53c.4-.38.4-1.02.01-1.41zm-3.5 2.09L12.8 9.8l1.38-1.38 1.41 1.41-1.38 1.38z"})
                                            "AutoFixHighRounded"))
