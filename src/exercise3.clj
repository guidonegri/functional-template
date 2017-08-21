(ns exercise3)

(defn fibonacci
  "Fibonacci of a number."
  [number] 
  (cond
    (= number 0) 0
    (= number 1) 1
    (> number 1) (+ (fibonacci (- number 1)) (fibonacci (- number 2))))
)
