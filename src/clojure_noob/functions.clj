(ns clojure-noob.functions
  (:gen-class))
(+ 1 2 3 4)
(* 1 2 3 4)
(first [1 2 3 4])

(or + -)

((or - +) 1 2 3)

((and (= 1 1) +) 1 2 3)

((first [+ 0]) 1 2 3)

(inc 1.1)

(map inc [0 1 2 3 4])

(type [1 2 3 3])

(+ (inc 199) (/ 100 (- 7 2)))

(defn too-enthusiastic
  "return a cheecr that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY THE BEST "
       "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(too-enthusiastic "Zelda")

(defn no-params
  []
  "I take no parameters!")

(defn one-param
  [x]
  (str "I take one parameter: " x))

(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
       "together to spite you! " x y))

(two-params "hello world " "meh this is lame")

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "Kanye West" "slap")
(x-chop "Kanye West")

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawnm, " whippersnapper "!!!"))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredibles")

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
     (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn my-first
  [[first-thing]]
  first-thing)

(my-first ["oven" "bike" "war-axe"])
 
(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
             "Here they are in case you need to cry over them: "
             (clojure.string/join ", " unimportant-choices))))

; (chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])

(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(defn better-announce-treasure-location
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

; (better-announce-treasure-location {:lat 28.22 :lng 81.33})

(defn receive-best-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))
  (println (str "Original data structure: " treasure-location)))

(receive-best-location {:lat 28.22 :lng 81.33})
