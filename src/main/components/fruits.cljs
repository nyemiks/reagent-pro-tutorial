(ns components.fruits
  (:require [components.fruit :refer [fruit]]))

(def my-fruits ["Apple", "Mango", "Banana", "Orange", "Pineapple"])

(def my-fruits2 [
                 {:name "Apple" :price 10 :emoji "&#127822;" :soldout true}
                 {:name "Banana" :price 2 :emoji "&#127820;" :soldout true}
                 {:name "Mango" :price 7 :emoji "&#128512;" :soldout false}
                 {:name "Orange" :price 5 :emoji "&#128512;" :soldout false}
                 {:name "Pineapple" :price 10 :emoji "&#127821;" :soldout true}
                 ]
  )


(defn fruits []
  [:div
    [:ul 
     (map (fn [fruit]
            (let [{:keys [name price emoji]} fruit]
               [:li {:key name} emoji " " name " $ " price]
              )
           
            )
          my-fruits2
          )
     ]
   ]
  )


(defn fruits2 
  "delegates each item to a fruit component"
  []
  [:div
    [:ul 
     (map (fn [item]
           ^{:key (:name item)} [fruit item]           
            )
          my-fruits2
          )
     ]
   ]
  )


(defn fruits3 
  "conditional rendering of lists."
  []
  [:div
    [:ul 
     (map (fn [item]
            (let 
             [
                {:keys [price]} item
              ]
               (when (> price 5)
                  ^{:key (:name item)} [fruit item]                   
                  )
              )                     
            )
          my-fruits2
          )
     ]
   ]
  )


(defn fruits4 
  "conditional rendering of lists."
  []
  [:div
    [:ul 
     (map (fn [item]
           ^{:key (:name item)} [fruit item]  
           )
          my-fruits2
          ) 
     ]
   ]
  )