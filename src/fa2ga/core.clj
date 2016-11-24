(ns fa2ga.core
  (:require [clj-fasta.core :as fa])
  (:require [clojure.java.io :as io])
  (:require [clojure.data.json :as json])
  (:import java.util.zip.GZIPInputStream))

(defn parse-fasta
  [fa-file]
  (with-open [r (-> fa-file io/input-stream GZIPInputStream. io/reader)]
    (->> (fa/fasta-seq r)
         first))
  )

(defn -main
  [input & rest]
  (print (json/write-str (parse-fasta input)))
  )
