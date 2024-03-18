(ns components.counter
  (:require 
    [reagent.core :as reagent :refer [atom]]
            )
  )



(defn counter[]
  (let 
   [
       count (atom 0)
       incrementBy  (atom 1)
   ]
    (fn []
      [:div 
       [:h1 "Count value is: " @count]
       [:button {:on-click (fn [] 
                              (swap! count #(+ %1 @incrementBy))
                             )
                 } "Increment"]
       [:button {:on-click (fn []
                              (swap! count #(- %1 @incrementBy))
                             )
                 }  "Decrement"]
       [:h1 "We are incrementing the value by " @incrementBy]
       [:button {:on-click #(swap! incrementBy inc)} "Increase increment"]
       [:button {:on-click #(swap! incrementBy dec)} "Decrease increment"]
       ]
      )       
    )
  )