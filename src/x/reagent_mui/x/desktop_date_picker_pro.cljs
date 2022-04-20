(ns reagent-mui.x.desktop-date-picker-pro
  "Imports @mui/x-date-pickers-pro/DesktopDatePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/desktop-date-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/DesktopDatePicker" :as MuiDesktopDatePicker]))

(def desktop-date-picker (adapt-react-class (.-DesktopDatePicker MuiDesktopDatePicker) "mui-desktop-date-picker"))