(ns reagent-material-ui.icons.sync-rounded
  "Imports @material-ui/icons/SyncRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sync-rounded (create-svg-icon (e "path" #js {"d" "M4 12c0 2.21.9 4.2 2.35 5.65l-1.5 1.5c-.31.31-.09.85.36.85H9.5c.28 0 .5-.22.5-.5v-4.29c0-.45-.54-.67-.85-.35l-1.38 1.38C6.68 15.15 6 13.65 6 12c0-2.39 1.41-4.45 3.43-5.41.34-.16.57-.48.57-.85v-.18c0-.68-.71-1.11-1.33-.83C5.92 6 4 8.77 4 12zm14.79-8H14.5c-.28 0-.5.22-.5.5v4.29c0 .45.54.67.85.35l1.38-1.38C17.32 8.85 18 10.35 18 12c0 2.39-1.41 4.45-3.43 5.41-.34.16-.57.48-.57.85v.18c0 .68.71 1.11 1.33.83C18.08 18 20 15.23 20 12c0-2.21-.9-4.2-2.35-5.65l1.5-1.5c.31-.31.09-.85-.36-.85z"})
                                   "SyncRounded"))
