(ns com.acme.clojure.pkg.sub.sub-interface)

(import com.acme.pkg.sub.SubInterface)

(defn reverse
  ([sub-interface s] (.reverse sub-interface s)))