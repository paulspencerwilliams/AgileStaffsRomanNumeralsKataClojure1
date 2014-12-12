(ns roman_numerals_kata.converter-test
  (:use midje.sweet)
  (:use [roman_numerals_kata.converter]))

(facts "about `roman-to-decimal`"
       (fact "it handles I"
             (roman-to-decimal "I") => 1
             (roman-to-decimal "II") => 2
             (roman-to-decimal "III") => 3)

       (fact "it handles V"
             (roman-to-decimal "IV") => 4 
             (roman-to-decimal "V") => 5
             (roman-to-decimal "VI") => 6))
