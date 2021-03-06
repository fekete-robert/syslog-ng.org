(defproject syslog-ng.org "0.1.0-SNAPSHOT"
  :description "The syslog-ng.org website"
  :url "http://syslog-ng.org/"
  :license {:name "Creative Commons Attribution-ShareAlike 4.0"
            :url "http://creativecommons.org/licenses/by-sa/4.0/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [stasis "0.7.0"]
                 [hiccup "1.0.5"]
                 [optimus "0.14.2"]
                 [ring "1.2.1"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler syslog-ng.org/app}
  :aliases {"build-site" ["run" "-m" "syslog-ng.org/export"]})
