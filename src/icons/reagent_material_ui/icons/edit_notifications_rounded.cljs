(ns reagent-material-ui.icons.edit-notifications-rounded
  "Imports @material-ui/icons/EditNotificationsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-notifications-rounded (create-svg-icon (e "path" #js {"d" "M17.58 6.25l1.77 1.77-4.84 4.84c-.09.09-.22.14-.35.14H13.1c-.28 0-.5-.22-.5-.5v-1.06c0-.13.05-.26.15-.35l4.83-4.84zm3.27-.44l-1.06-1.06c-.2-.2-.51-.2-.71 0l-.85.85L20 7.37l.85-.85c.2-.2.2-.52 0-.71zM20 18c0 .55-.45 1-1 1H5c-.55 0-1-.45-1-1s.45-1 1-1h1v-7c0-2.79 1.91-5.14 4.5-5.8v-.7c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v.7c.82.21 1.57.59 2.21 1.09l-4.52 4.52c-.38.38-.59.88-.59 1.41V13c0 1.1.9 2 2 2h1.77c.53 0 1.04-.21 1.41-.59L18 12.2V17h1c.55 0 1 .45 1 1zm-10 2h4c0 1.1-.9 2-2 2s-2-.9-2-2z"})
                                                 "EditNotificationsRounded"))