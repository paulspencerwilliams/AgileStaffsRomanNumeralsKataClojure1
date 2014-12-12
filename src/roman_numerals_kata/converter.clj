(ns roman_numerals_kata.converter)

;;; converts roman numeral strings to their decimal equivalent
(defn roman-to-decimal [roman]
  (if (.contains roman "V") 
    (if (.contains roman "I") 
      (if (= (.substring roman 0 1) "I")
        4
        (+ 5 (- (count roman) 1)))
      5) 
    (count roman)))
