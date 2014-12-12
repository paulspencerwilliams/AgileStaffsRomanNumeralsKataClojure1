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
         s (map lookup (seq roman))]
    (if-not (empty? s)
      (recur (+ d (first s)) (rest s))
      d)))
