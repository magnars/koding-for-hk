(ns helper
  (:refer-clojure :exclude [replace])
  (:require [clojure.string :as str]))

(defn ask [& txts]
  (print (str (str/join txts) " "))
  (flush)
  (read-line))

(defn say [& txts]
  (println (str/join txts))
  (Thread/sleep 300))

(defn replace [s re f]
  (str/replace s re (fn [_] (f))))

(defn number [s]
  (if (string? s)
    (Integer/parseInt s)
    s))

(defn add [a b]
  (+ (number a) (number b)))

(defn subtract [a b]
  (- (number a) (number b)))

(defn random [coll]
  (rand-nth coll))
