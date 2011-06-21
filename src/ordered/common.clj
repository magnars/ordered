(ns ordered.common
  (:use [amalloy.utils.transform :only [transform-if]]))

(def ensure-vector (transform-if (complement vector?) vec))
(defmacro change! [field f & args]
  `(set! ~field (~f ~field ~@args)))
