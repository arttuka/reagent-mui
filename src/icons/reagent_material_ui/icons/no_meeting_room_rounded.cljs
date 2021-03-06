(ns reagent-material-ui.icons.no-meeting-room-rounded
  "Imports @material-ui/icons/NoMeetingRoomRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def no-meeting-room-rounded (create-svg-icon (e "path" #js {"d" "M14 6h3v8.17l2 2V5c0-.55-.45-1-1-1h-4c0-.55-.45-1-1-1H6c-.05 0-.09.02-.14.03L14 11.17V6zm6.49 14.49L3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L5 7.83V19H4c-.55 0-1 .45-1 1s.45 1 1 1h9c.55 0 1-.45 1-1v-3.17l5.07 5.07c.39.39 1.02.39 1.41 0 .4-.39.4-1.02.01-1.41z"})
                                              "NoMeetingRoomRounded"))
