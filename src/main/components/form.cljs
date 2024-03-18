(ns components.form
  (:require [reagent.core :as reagent :refer [atom]])
  )


(defn form[]
  (let
   [
      name   (atom "")   
   ]
    (fn []
      [:div 
        [:form 
           [:input {:value @name
                    :on-change (fn [e]
                               ; (.info js/console e)
                                (let 
                                 [
                               ;  text (-> e .-target .-value)  ; thread first macro
                                   text (.. e -target -value)   ; using .. macro
                                  
                                  ]
                                    (.info js/console text)
                                    (reset! name text)
                                  )
                                )
                    } 
            ]
         ]
       ]
      )
    )
  
  )


(defn form2[]
  (let
   [
      name   (atom "")   
   ]
    (fn []
      [:div 
        [:form 
           [:input {
                    :value @name
                    :on-change #(reset! name (.. %1 -target -value))
                    } 
            ]
         ]
       ]
      )
    )
  
  )


(defn form3[]
  (let
   [
      name   (atom {
                    :firstname ""
                    :lastname  ""
                    }
                   )   
    
   
   ]
    (fn []
      [:div 
        [:form 
           [:input {
                    :value (:firstname @name)
                    :on-change (fn [e]
                                 (let 
                                     [
                                      text (.. e -target -value)
                                      ]
                                  ;   (.info js/console text)
                                     (swap! name assoc :firstname text)
                                   )
                                 )
                    } 
            ]
            [:input {
                    :value (:lastname @name)
                    :on-change (fn [e]
                                 (let 
                                     [
                                      text (.. e -target -value)
                                      ]
                                  ;   (.info js/console text)
                                     (swap! name assoc :lastname text)
                                   ;   (swap! name update :firstname assoc text)
                                   )
                                 )
                    } 
            ]

            [:button {:on-click (fn [e]
                                  (.preventDefault e)
                                  (.info js/console @name)
                                  )
                      } "Add"]
         ]
       ]
      )
    )
  
  )


(defn form4[]
  (let
   [
      name   (atom {
                    :firstname ""
                    :lastname  ""
                    }
                   )    
   ]
    (fn []
      [:div 
        [:form 
           [:input {
                    :value (:firstname @name)
                    :on-change #(swap! name assoc :firstname (.. %1 -target -value))
                    } 
            ]
            [:input {
                    :value (:lastname @name)
                    :on-change #(swap! name assoc :lastname (.. %1 -target -value))
                    } 
            ]

            [:button {:on-click (fn [e]
                                  (.preventDefault e)
                                  (.info js/console @name)
                                  )
                      } "Add"]
         ]
       ]
      )
    )
  
  )