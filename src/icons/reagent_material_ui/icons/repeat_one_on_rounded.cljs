(ns reagent-material-ui.icons.repeat-one-on-rounded
  "Imports @material-ui/icons/RepeatOneOnRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def repeat-one-on-rounded (create-svg-icon (e "path" #js {"d" "M21 1H3c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-2 17c0 .55-.45 1-1 1H7v1.79c0 .45-.54.67-.85.36l-2.79-2.79c-.2-.2-.2-.51 0-.71l2.79-2.79c.31-.32.85-.1.85.35V17h10v-3c0-.55.45-1 1-1s1 .45 1 1v4zm-8.25-7.5c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h1.5c.41 0 .75.34.75.75v4.5c0 .41-.34.75-.75.75s-.75-.34-.75-.75V10.5h-.75zm9.89-4.15l-2.79 2.79c-.31.32-.85.1-.85-.35V7H7v3c0 .55-.45 1-1 1s-1-.45-1-1V6c0-.55.45-1 1-1h11V3.21c0-.45.54-.67.85-.36l2.79 2.79c.2.2.2.51 0 .71z"})
                                            "RepeatOneOnRounded"))
