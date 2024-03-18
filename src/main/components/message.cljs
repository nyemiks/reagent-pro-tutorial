(ns components.message)


(defn- handle-click []
   (.info js/console "Button clicked !")
  )

(defn message[]
  [:div
    [:button {:on-click handle-click} "Click here to get a message"]
   ]
  )