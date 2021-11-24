(ns ae.alias+ns-test
  (:require [clojure.test :as t]
            [ae.alias+ns :as sut]))

(t/deftest alias+ns-test
  (t/testing "Aliases can be created by alias+ns."
    (let [actual (macroexpand `(sut/alias+ns 'bar 'ae.bar))]
      (t/is (= `(do (create-ns 'ae.bar) (alias 'bar 'ae.bar))
               actual)))))

(t/deftest aliases+ns-test
  (t/testing "Multiple aliases can be created by aliases+ns."
    (let [actual (macroexpand `(sut/aliases+ns {'bar 'ae.bar 'car 'ae.car}))]
      (t/is (= `(do (sut/alias+ns 'bar 'ae.bar)
                    (sut/alias+ns 'car 'ae.car))
               actual)))))
