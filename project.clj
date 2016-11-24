(defproject fa2ga "0.1.0-SNAPSHOT"
  :description "Take a set of fasta files and output json documents for GA4GH ReferenceSet and Reference"
  :url "https://github.com/andrewjesaitis/fa2ga"
  :license {:name "Apache License v 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [clj-fasta "0.2.2"]
                 [org.clojure/data.json "0.2.6"]]
  :main fa2ga.core)
