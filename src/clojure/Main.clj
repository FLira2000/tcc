(defn hello
  ([name] (str "hello, " name)))

(time (doseq [value *command-line-args*]
        (println (hello value))))