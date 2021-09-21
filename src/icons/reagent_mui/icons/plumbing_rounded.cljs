(ns reagent-mui.icons.plumbing-rounded
  "Imports @mui/icons-material/PlumbingRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def plumbing-rounded (create-svg-icon [(e "path" #js {"d" "m19.28 4.93-2.12-2.12c-.78-.78-2.05-.78-2.83 0L11.5 5.64l2.12 2.12 2.12-2.12 3.54 3.54c1.17-1.18 1.17-3.08 0-4.25zM5.49 13.77c.59.59 1.54.59 2.12 0l2.47-2.47-2.12-2.13-2.47 2.47c-.59.59-.59 1.54 0 2.13z"}) (e "path" #js {"d" "m14.33 8.46-.71.71-3.18-3.18c-.59-.59-1.54-.59-2.12 0-.59.59-.59 1.54 0 2.12l3.18 3.18-7 7c-.7.7-.88 1.84-.29 2.65.74 1.03 2.19 1.12 3.05.26l9.19-9.2c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-2.12-2.12a.987.987 0 0 0-1.41-.01z"})]
                                       "PlumbingRounded"))
