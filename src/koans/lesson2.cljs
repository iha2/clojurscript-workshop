(ns koans.lesson2)

;; Clojurescript Collections

;; Anything is quotes also acts like a function. Go through these
;; and use the functions to predict what the outcomes should be.

;; Lists
;; You can create a 'list' with a function or with syntactic sugar
(= '() (list 1 2 3 4 5))

;; They behave like proper list so you should only access the 'first' in the sequence
(= _ (first '(1 2 3 4 5)))
;

;; You can get the 'rest' of the the list
(= __ ( __ '(1 2 3 4 5)))

;; you can 'count' how many are in a list
(= __ (__ '(1 2 3)))

;; When there `rest` is called on a single value, it only returns he base case
(= '() (rest '(100)))

;; cons, short for construct, adds an element to the front of list
(= __ (cons :a '(:b :c :d :e)))


;; conj is similar to cons but works for both lists and vectors
(= __ (conj '(:b :c :d :e) :a))

;; Speaking of vectors...

;; Vectors

;; You can use vectors in clojure as array-like structures
(= __ (count [42]))

;; You can create a vector from a list
(= __ (vec '(1 2 3 4 5 6)))

;; Conjoining to a vector is different than to a list
;; (hint it O (1) to add to the end of the list)
(= __ (conj [111 222] 333))

;; You can get the 'first' element of a vector like so
(= __ ( __ [:peanut :butter :and :jelly]))

;; And the 'last' in a similar fashipn
(= __ (__ [:peanut :butter :and :jelly]))

;; and you can access by index
(= __ (nth [:peanut :butter :and :jelly] 3))

;; but if it's not there it will crash! so be careful!!
(nth [:peanut :butter :and :jelly] 25)

;; You can slice vectors just like you can arrays
(= __ (subvec [:peanut :butter :and :jelly] 1 3))

;; Equalty in collections in done by value, independant of the type of collection
;; Therefore an equality check is an O(n) operation
(= (list 1 2 3) (vector 1 2 3 4))


;; note that conj can take lots of items to add to a collection
(conj [1 2 3 4 6] 67 76)

;; but cons cannot
(cons 67 76 (1 2 3 4 6))
