(ns core
  (:require ; ["react" :as react]
            ; ["react-dom" :as react-dom]
            ;[reagent.core :as r]
            [reagent.dom :as rdom]
            [components.hello :refer [hello]]
            [components.fruits :refer [fruits fruits2 fruits3 fruits4]]
            [components.conditional-component :refer [conditionalcomponent conditionalcomponent2]]
            [components.message :refer [message]] 
            [components.counter :refer [counter]]
            [components.form :refer [form form2 form3 form4]]
   )
  )


(defn app []
 ; [hello {:name "Mairo" :message " hello !"}]
  ;[hello {:id 2 :name "John" :message " hi !"}]
   ; [fruits]
  ; [fruits2]
  ;  [fruits3]
   ; [fruits4]
  ;[conditionalcomponent]
   ; [conditionalcomponent2]
 ; [message]
   ; [counter]
   ; [form2]
    ; [form3]
     [form4]
  )


(defn ^:dev/after-load start []
  (rdom/render [app] (js/document.getElementById "app")))


(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start)
  )

;(defn main []
 ; (js/console.log (.-version react)))


;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))

;(defn main []
 ; (let [app-node (.getElementById js/document "app")]
 ;   (rdom/render [app/app] app-node)))

;(main)