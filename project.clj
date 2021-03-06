(defproject blockchain "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.1.143"]
                 [expound "0.4.0"]
                 [digest "1.4.6"]
                 ]
  :profiles {:dev {:dependencies [[io.aviso/pretty "0.1.34"]
                                  [org.clojure/test.check "0.10.0-alpha2"]
                                  [orchestra "2017.11.12-1"]
                                  [com.gfredericks/test.chuck "0.2.8"]]
                   :plugins [[io.aviso/pretty "0.1.34"]
                             [com.jakemccrary/lein-test-refresh "0.21.1"]
                             [lein-cljfmt "0.5.7"]]}}
  )
