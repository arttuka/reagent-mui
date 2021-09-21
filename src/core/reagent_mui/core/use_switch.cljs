(ns reagent-mui.core.use-switch
  "Imports @mui/core/SwitchUnstyled/useSwitch as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-switch/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/core/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def use-switch (wrap-js-function (.-useSwitch MuiSwitchUnstyled)))
