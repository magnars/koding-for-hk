(ns test
  (:refer-clojure :exclude [replace])
  (:require [clojure.string :as str]
            [helper :refer [ask say replace add subtract]]))

(defn -main [])

(def the-name (ask "Hei! Hva heter du?"))

(say the-name " er kul")

(def the-age (ask "Hvor gammel er du, " the-name "?"))

(say "Oi, så stor! Om ti år er du " (add the-age 10) "!")

(say (replace (slurp "historie1.txt")
              #"___"
              #(ask "Har du et adjektiv?")))

(dotimes [n 5]
  (println)
  (def the-name (ask "Hei! Hva heter du?"))

  (def kind-words ["kul" "snill" "flink" "smart" "morsom" "hyggelig" "koselig"])

  (say the-name " er " (random kind-words)))
