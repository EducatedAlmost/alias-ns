(ns ae.alias+ns-test
  (:require [clojure.test :as t]
            [ae.alias+ns :as sut]))

#_(t/deftest alias+ns-test
    (t/testing "Aliases can be created by alias+ns."
      (do (sut/alias+ns 'bar 'ae.bar)
          (t/is (contains? (ns-aliases 'ae.alias+ns-test) 'bar)))))
