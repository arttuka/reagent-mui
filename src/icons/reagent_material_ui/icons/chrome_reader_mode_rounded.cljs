(ns reagent-material-ui.icons.chrome-reader-mode-rounded
  "Imports @material-ui/icons/ChromeReaderModeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chrome-reader-mode-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14h-7V6h7v12zm-5.25-9.5h3.5c.41 0 .75.34.75.75s-.34.75-.75.75h-3.5c-.41 0-.75-.34-.75-.75s.34-.75.75-.75zm0 2.5h3.5c.41 0 .75.34.75.75s-.34.75-.75.75h-3.5c-.41 0-.75-.34-.75-.75s.34-.75.75-.75zm0 2.5h3.5c.41 0 .75.34.75.75s-.34.75-.75.75h-3.5c-.41 0-.75-.34-.75-.75s.34-.75.75-.75z"})
                                                 "ChromeReaderModeRounded"))
