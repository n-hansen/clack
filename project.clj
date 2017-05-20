(defproject clack "0.1.0-SNAPSHOT"
  :description "Simple Phabricator bot for Slack"
  :url "https://rbaron.net/slackie"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [com.taoensso/sente "1.11.0"]
                 [environ "1.1.0"]
                 [http-kit "2.2.0"]]
  :main ^:skip-aot clack.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})