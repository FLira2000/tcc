(defn hello 
    ([name] (str "hello, " name)))
    
(doseq [value *command-line-args*]
    (println value))
    
    


