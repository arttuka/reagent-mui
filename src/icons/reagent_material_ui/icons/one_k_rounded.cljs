(ns reagent-material-ui.icons.one-k-rounded
  "Imports @material-ui/icons/OneKRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def one-k-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM9.25 15c-.41 0-.75-.34-.75-.75V10.5h-.75c-.41 0-.75-.34-.75-.75S7.34 9 7.75 9H9c.55 0 1 .45 1 1v4.25c0 .41-.34.75-.75.75zm6.34 0c-.22 0-.42-.1-.55-.27l-1.54-1.98v1.5c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-4.5c0-.41.34-.75.75-.75s.75.34.75.75v1.5l1.54-1.98c.13-.17.34-.27.55-.27.58 0 .91.66.56 1.12L14.75 12l1.41 1.88c.34.46.01 1.12-.57 1.12z"})
                                    "OneKRounded"))