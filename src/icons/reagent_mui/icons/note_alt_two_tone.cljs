(ns reagent-mui.icons.note-alt-two-tone
  "Imports @mui/icons-material/NoteAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note-alt-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zm9.73-11.85c.2-.2.51-.2.71 0l1.41 1.41c.2.2.2.51 0 .71l-1.06 1.06-2.12-2.12 1.06-1.06zM7 14.86l5.96-5.96 2.12 2.12L9.1 17H7v-2.14z", "opacity" ".3"}) (e "path" #js {"d" "M19 3h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7-.25c.41 0 .75.34.75.75s-.34.75-.75.75-.75-.34-.75-.75.34-.75.75-.75zM19 19H5V5h14v14z"}) (e "path" #js {"d" "m15.08 11.03-2.12-2.12L7 14.86V17h2.1zm1.77-1.76c.2-.2.2-.51 0-.71l-1.41-1.41c-.2-.2-.51-.2-.71 0l-1.06 1.06 2.12 2.12 1.06-1.06z"})]
                                        "NoteAltTwoTone"))
