(ns roman_numerals_kata.converter)

(defn roman-to-decimal [roman-numeral]
  (loop [cur-total 0
         highest-value 0 
         values-backwards (map 
                            #({\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000} %)
                            (reverse (seq roman-numeral)))]
    (if-not (empty? values-backwards)
      (let [cur-value (first values-backwards)]
        (if (< cur-value highest-value) 
          (recur (- cur-total cur-value) highest-value (rest values-backwards))
          (recur (+ cur-total cur-value) cur-value (rest values-backwards))))
      cur-total)))
