# Agile Staffs Roman Numerals Kata in Clojure 

Before Thursday night's session, I made a promise to myself. Whichever kata I
chose, I would do it in Clojure. However, as I started pairing with Mike who, as
a relatively new first year student, I thought a language as initially mind
bending as Clojure combined with introductions to TDD and Git might be step too
far. We thus explored the Roman Numerals Kata in Java. 

To fulfil my promise to myself, I pretty much completed the kata in yesterday's
lunch break. As I succeeded in completing the challenge, I did find a couple of
invalid acceptance tests in the challenge which I removed, and I did a little
refactoring today to make the code more readable.  

# Approach

Initially, I did simple triangulation to get a basic approach which I knew
wouldn't be sufficiently extensible to complete the whole problem. However,
during this, I discovered an approach by converting each character to it's
numeric value, and reversing through this sequence whilst keeping a register of
the highest value I'd found to that point. For each value, I would sum or reduce
the total dependant on whether the value was smaller or larger than the
register. This would handle situations like IV where I reduces the value 5 by 1,
rather than adding. 

# How to run the tests `lein midje`
