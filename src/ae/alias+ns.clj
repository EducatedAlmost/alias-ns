(ns ae.alias+ns)

(defmacro alias+ns [a ns]
  `(do
     (clojure.core/create-ns ~ns)
     (clojure.core/alias ~a ~ns)))

(defn aliases+ns [m]
  (doseq [[a ns] m]
    (alias+ns a ns)))
