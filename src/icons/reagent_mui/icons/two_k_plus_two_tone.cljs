(ns reagent-mui.icons.two-k-plus-two-tone
  "Imports @mui/icons-material/TwoKPlusTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def two-k-plus-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14v-6.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19V5H5v14zm6-10h1.5v2.25L14.25 9H16l-2.25 3L16 15h-1.75l-1.75-2.25V15H11V9zm-5 3.5c0-.55.45-1 1-1h1.5v-1H6V9h3c.55 0 1 .45 1 1v1.5c0 .55-.45 1-1 1H7.5v1H10V15H6v-2.5z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 8.5h-1.5V10h-1v1.5H15v1h1.5V14h1v-1.5H19V19H5V5h14v6.5z"}) (e "path" #js {"d" "M10 13.5H7.5v-1H9c.55 0 1-.45 1-1V10c0-.55-.45-1-1-1H6v1.5h2.5v1H7c-.55 0-1 .45-1 1V15h4v-1.5zm2.5-.75L14.25 15H16l-2.25-3L16 9h-1.75l-1.75 2.25V9H11v6h1.5z"})]
                                          "TwoKPlusTwoTone"))
