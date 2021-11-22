(ns ae.alias+ns)

(defmacro alias+ns [a ns]
  `(do
     (clojure.core/create-ns ~ns)
     (clojure.core/alias ~a ~ns)))

(defmacro aliases+ns [m]
  `(do ~@(for [[a ns] m]
           `(alias+ns ~a ~ns))))
