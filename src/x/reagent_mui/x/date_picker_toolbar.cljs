(ns reagent-mui.x.date-picker-toolbar
  "Imports @mui/x-date-pickers/DatePickerToolbar as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/date-picker-toolbar/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/DatePickerToolbar" :as MuiDatePickerToolbar]))

(def date-picker-toolbar (r/adapt-react-class MuiDatePickerToolbar/DatePickerToolbar))
