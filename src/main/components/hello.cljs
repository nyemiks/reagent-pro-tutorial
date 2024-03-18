(ns components.hello)

(def name1 "Rob")


(defn hello [props]
  (let
      [
        {:keys [name message]} props
       ]
    [:div 
   ;  [:h1 (:name props) (:message props)]
      [:h1 name message]
    ]
    )
  )