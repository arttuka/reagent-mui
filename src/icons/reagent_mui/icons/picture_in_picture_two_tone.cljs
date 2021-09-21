(ns reagent-mui.icons.picture-in-picture-two-tone
  "Imports @mui/icons-material/PictureInPictureTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def picture-in-picture-two-tone (create-svg-icon [(e "path" #js {"d" "M19 7h-8v6h8V7zm-2 4h-4V9h4v2z"}) (e "path" #js {"d" "M13 9h4v2h-4z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 1.98 2 1.98h18c1.1 0 2-.88 2-1.98V5c0-1.1-.9-2-2-2zm0 16.01H3V4.98h18v14.03z"})]
                                                  "PictureInPictureTwoTone"))
