(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x) ) false true))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (rem n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n)  "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (and (>= age 13) (<= age 19) ) true false))

(defn not-teen? [age]
  (if(teen? age) false true))

(defn generic-doublificate [x]
  (cond
    (number? x)  (* x 2)
    (empty? x) nil
    (vector? x) (* 2 (count x))
    (list? x)  (* 2 (count x))
    :else true))


(defn leap-year? [year]
  (if
    (or
      (and (divides? 4 year) (= false (divides? 100 year)))
      (and (divides? 4 year) (divides? 100 year) (divides? 400 year))) 
    true false))

; '_______'


