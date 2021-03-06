(ns reagent-material-ui.icons.fiber-pin-rounded
  "Imports @material-ui/icons/FiberPinRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fiber-pin-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6c0-1.11-.89-2-2-2zm-10 7.5c0 .83-.67 1.5-1.5 1.5h-2v1.25c0 .41-.34.75-.75.75S5 14.66 5 14.25V10c0-.55.45-1 1-1h2.5c.83 0 1.5.67 1.5 1.5v1zm2.75 2.75c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-4.5c0-.41.34-.75.75-.75s.75.34.75.75v4.5zm6.25-.04c0 .44-.35.79-.79.79-.25 0-.49-.12-.64-.33l-2.31-3.17v2.88c0 .34-.28.62-.62.62h-.01c-.35 0-.63-.28-.63-.62V9.83c0-.46.37-.83.83-.83.27 0 .52.13.67.35l2.25 3.15V9.62c0-.34.28-.62.62-.62h.01c.34 0 .62.28.62.62v4.59z"}) (e "path" #js {"d" "M6.5 10.5h2v1h-2z"}))
                                        "FiberPinRounded"))
