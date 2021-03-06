(ns reagent-material-ui.icons.icecream-two-tone
  "Imports @material-ui/icons/IcecreamTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def icecream-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.32 13.42l2.73 5.21 2.67-5.23c-.84.39-1.77.6-2.72.6-.94 0-1.85-.21-2.68-.58zm7.99-5.4l-.77-.12-.06-.78C16.29 4.8 14.34 3 12 3S7.71 4.8 7.51 7.12l-.06.78-.77.13C5.72 8.18 5 9.02 5 10c0 1.11.9 2 2 2 .52 0 1.01-.21 1.39-.56l.56-.54.66.41c.71.45 1.53.69 2.39.69s1.68-.24 2.39-.68l.66-.42.56.54c.38.36.87.56 1.39.56 1.1 0 2-.9 2-2 0-.99-.72-1.82-1.69-1.98z", "opacity" ".3"}) (e "path" #js {"d" "M18.38 6.24C17.79 3.24 15.14 1 12 1S6.21 3.24 5.62 6.24C4.08 6.81 3 8.29 3 10c0 2.21 1.79 4 4 4 .12 0 .23-.02.34-.02L12.07 23l4.61-9.03c.11.01.21.03.32.03 2.21 0 4-1.79 4-4 0-1.71-1.08-3.19-2.62-3.76zm-6.33 12.39l-2.73-5.21c.83.37 1.74.58 2.68.58.95 0 1.88-.21 2.72-.6l-2.67 5.23zM17 12c-.52 0-1.01-.2-1.39-.56l-.56-.54-.66.42c-.71.44-1.53.68-2.39.68s-1.68-.24-2.39-.69l-.66-.41-.56.54c-.38.35-.87.56-1.39.56-1.1 0-2-.89-2-2 0-.98.72-1.82 1.68-1.97l.77-.13.06-.78C7.71 4.8 9.66 3 12 3s4.29 1.8 4.48 4.12l.06.78.77.12c.97.16 1.69.99 1.69 1.98 0 1.1-.9 2-2 2z"}))
                                        "IcecreamTwoTone"))
