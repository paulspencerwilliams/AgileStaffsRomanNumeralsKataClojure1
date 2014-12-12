(ns roman_numerals_kata.converter)

(def numeral-values {"I" 1
                     "V"  5
                     "X"  10
                     "L"  50
                     "C"  100
                     "D"  500
                     "M"  1000})  

;;; converts roman numeral strings to their decimal equivalent
(defn lookup [r] (numeral-values (str r)))

(defn roman-to-decimal [roman]
  (loop [d 0
         l 0 
         s (map lookup (reverse (seq roman)))]
    (if-not (empty? s)
      (let [n (first s)]
        (if (< n l) 
          (recur (- d n) l (rest s))
          (recur (+ d n) n (rest s))))
      d)))
