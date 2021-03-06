(ns reagent-material-ui.icons.notifications-active-rounded
  "Imports @material-ui/icons/NotificationsActiveRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def notifications-active-rounded (create-svg-icon (e "path" #js {"d" "M12 22c1.1 0 2-.9 2-2h-4c0 1.1.9 2 2 2zm6-12c0-2.79-1.91-5.14-4.5-5.8v-.7c0-.83-.67-1.5-1.5-1.5s-1.5.67-1.5 1.5v.7C7.91 4.86 6 7.21 6 10v7H5c-.55 0-1 .45-1 1s.45 1 1 1h14c.55 0 1-.45 1-1s-.45-1-1-1h-1v-7zM6.15 3.15c-.4-.4-1.05-.39-1.44.02-1.44 1.53-2.4 3.52-2.65 5.72-.06.59.41 1.11 1 1.11.5 0 .93-.37.99-.87.19-1.77.97-3.37 2.12-4.61.37-.38.36-.99-.02-1.37zm11.71.01c-.38.38-.39.99-.02 1.38 1.16 1.23 1.93 2.83 2.12 4.6.05.5.49.87.99.87.6 0 1.07-.52 1-1.11-.24-2.2-1.2-4.18-2.64-5.71-.4-.42-1.05-.43-1.45-.03z"})
                                                   "NotificationsActiveRounded"))
