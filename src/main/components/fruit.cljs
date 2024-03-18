(ns components.fruit)

(defn fruit [item]
  (let [
        {:keys [name price emoji soldout]} item        
       ]
       [:li emoji " " name " $ " price  (when soldout " sold out")]
    )
  )