(ns zombiespill
  (:refer-clojure :exclude [replace])
  (:require [clojure.string :as str]
            [helper :refer [ask say replace add subtract random]]))

(defn -main [])

(defn begge-zombiene-tatt []
  (say " gutten tar begge zombiene."))

(defn zombiene-kommer-inn []
  (say " zombiene kommer inn i garasjen"))

(defn gutten-tok-en-zombie []
  (say " gutten klarer bare å ta en zombie")
  (say " hva skal han gjøre?")
  (say " 1. finne et annet våpen ")
  (say " 2. lokke garasjeporten")
  (def the-answer (ask ":"))
  (case the-answer
    "1." (say " han klarer å ta zombien")
    "2." (say " zombien klarer ikke å ta gutten så han går sin vei")))

(defn starten-av-spillet []
  (say " Det var en gang en gutt som måtte forsvare seg mot zombier.")
  (say " Han står i garasjen. Utenfor står det to zombier.")
  (say " Hva skal han bruke som våpen?")
  (say " 1. maskingevær")
  (say " 2. feiekost")
  (say " 3. øks")

  (def the-answer (ask ":"))

  (case the-answer
    "1" (begge-zombiene-tatt)
    "1." (begge-zombiene-tatt)
    "2" (zombiene-kommer-inn)
    "2." (zombiene-kommer-inn)
    "3" (gutten-tok-en-zombie)
    "3." (gutten-tok-en-zombie)))

(starten-av-spillet)
