(ns tcc.core)
(require '[tcc.Greeter :as Greeter])

(defn -main [& args]
  (doseq [arg args] (println (Greeter/greet arg))))

; (require '[jmh.core :as jmh])
; (jmh/run )
