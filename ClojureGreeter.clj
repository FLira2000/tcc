(defn hello
  ([name] (str "hello, " name)))

(def -main
  (time (doseq [value *command-line-args*]
          (println value))))