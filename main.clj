(defn line [space len]
    (str
        (reduce str (repeat space " "))
        (reduce str (repeat (- len space) "#"))))

(let [n (Integer/parseInt (read-line))]
    (loop [i (dec n)]
        (println (line i n))
        (if (> i 0)
            (recur (dec i)))))
