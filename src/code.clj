(ns code
  (:refer-clojure :exclude [replace])
  (:require [clojure.string :as str]
            [helper :refer [ask say replace add subtract random]]))

(defn -main [])

(comment
  (say "polien")
  (say "polito")
  (say "politre")
  (say "polifire")
  (say "polifem")
  (say "poliseks")
  (say "polisju")
  (say "poliåtte")
  (say "polini")
  (say "politi")

  (dotimes [i 1000]
    (say "rema " i)))

(def the-name (ask "hva heter du?"))

(def nice-things ["kul"
                  "flink"
                  "god"
                  "snill"
                  "morsom"])

(say the-name " er " (rand-nth nice-things))
