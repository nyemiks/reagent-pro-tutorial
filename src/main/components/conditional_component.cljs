(ns components.conditional-component
  (:require [components.code :refer [code]]
            [components.welcome :refer [welcome]]
            )
  )

(defn conditionalcomponent[]
  (let 
       [display true]

    (if display
      [:div [:h3 "This is a conditional component"]]
      [:div [:h3 "Code everyday !"]]
      )
    
    )
  
  )


(defn conditionalcomponent2[]
  (let 
       [display true]

    (if display
      [welcome]
      [code]
      )
    
    )
  
  )