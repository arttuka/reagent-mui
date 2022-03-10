(ns reagent-mui.icons.browse-gallery-rounded
  "Imports @mui/icons-material/BrowseGalleryRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browse-gallery-rounded (create-svg-icon [(e "path" #js {"d" "M9 3c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9zm2.09 12.5L8.59 13c-.38-.38-.59-.88-.59-1.41V8c0-.55.45-1 1-1s1 .45 1 1v3.59l2.5 2.5c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0z"}) (e "path" #js {"d" "M17.99 5.08c0 .37.21.69.53.88C20.6 7.17 22 9.42 22 12s-1.4 4.83-3.48 6.04c-.32.19-.53.51-.53.88 0 .77.84 1.25 1.51.86C22.18 18.22 24 15.32 24 12c0-3.32-1.82-6.22-4.5-7.78-.67-.39-1.51.09-1.51.86z"})]
                                             "BrowseGalleryRounded"))