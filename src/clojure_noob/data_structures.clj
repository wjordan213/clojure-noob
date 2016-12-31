(ns clojure-noob.data-structures
  (:gen-class))
(+ 1 2 3)
(str "it was the panda " "in the library" " with a dust buster"
(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!"))

(if false
  "By Odin's Elbow!")

(if false
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

(when true
  (println "Success!")
  "Abra cadabra")

(nil? 1)

(nil? nil)

(if "string" "alpha")

(if nil
  "this wont print"
  "nil is falsey")

(= 1 1)

(= nil nil)

(or false nil :some_thing :bla_bla)

(or (= 0 1) (= "yes" "no"))
(or nil)

(and :feelin_good :bad)

(and :fellin nil false)

(def failed-protaganist-names
  ["Larry Potter" "Doreen the explorer" "The Incredible Bulk"])

failed-protaganist-names

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOMED!")))
(error-message :mild)
(error-message :severe)

93
1.2
1/5

(:last-name {:first-name "Charlie"
  :last-name "Burner"}
 )

(({"string-key" +} "string-key") 1 2)

(({"string-key" { :first "Harris" :middle "bla"}} "string-key") :middle)

(get (hash-map :a 1 :b 2) :f)

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
({:a 0 :b 2} :a)

({:a 0 :b 3} :c "badd")

(get [3 2 1] 0)

(get-in ["a" {:name "Pugl"} "c"] [1 :name])

(vector "cre" "is" "lame")

(conj [1 2 3 3] 4)

'(1 2 3)

(nth '(:a :b :c) 0)

((nth (list 1 "two" {3 4}) 2) 3)

#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 2)

(conj #{:a :b} :c :d)

(set '(3 3 3 5 5))

(contains? #{:a :b} :c)

(contains? #{nil} nil)

(:c #{:a :b})

(contains? #{:a nil} nil)
