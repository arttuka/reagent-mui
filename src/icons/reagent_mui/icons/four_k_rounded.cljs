(ns reagent-mui.icons.four-k-rounded
  "Imports @mui/icons-material/FourKRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def four-k-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.89-2-2-2zm-7 9.76c0 .41-.34.75-.75.75H11v.74c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-.75h-2c-.55 0-1-.45-1-1V9.75c0-.41.34-.75.75-.75s.75.34.75.75V12h1.5V9.75c0-.41.34-.75.75-.75s.75.34.75.75V12h.25c.41 0 .75.34.75.75v.01zm5.47 1.14c.22.33.13.77-.2.98-.12.08-.26.12-.39.12-.23 0-.45-.11-.59-.32L14.5 12v2.24c0 .41-.34.75-.75.75-.41.01-.75-.33-.75-.74v-4.5c0-.41.34-.75.75-.75s.75.34.75.75v2.24l1.79-2.68c.22-.33.66-.41.98-.2.33.22.41.66.2.98L16.2 12l1.27 1.9z"})
                                     "FourKRounded"))
