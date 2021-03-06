(ns reagent-material-ui.icons.filter-9-plus-rounded
  "Imports @material-ui/icons/Filter9PlusRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-9-plus-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 6c-.55 0-1 .45-1 1v13c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1H4V7c0-.55-.45-1-1-1zm8 2h1v1h-1z"}) (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-6 10c0 1.11-.9 2-2 2h-1c-.55 0-1-.45-1-1s.45-1 1-1h1v-1h-1c-1.1 0-2-.89-2-2V8c0-1.11.9-2 2-2h1c1.1 0 2 .89 2 2v4zm5.5-1h-1v1c0 .55-.45 1-1 1s-1-.45-1-1v-1h-1c-.55 0-1-.45-1-1s.45-1 1-1h1V8c0-.55.45-1 1-1s1 .45 1 1v1h1c.55 0 1 .45 1 1s-.45 1-1 1z"}))
                                            "Filter9PlusRounded"))
