(ns exercise2)

(defn only-greater-than-five
  "Filter values greater than 5 from a list."
  [list]
  (filter (fn [i] (> i 5)) list)
)
