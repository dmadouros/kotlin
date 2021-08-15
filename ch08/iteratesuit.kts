enum class Suit { CLUBS, DIAMONDS, HEARTS, SPADES }

val diamonds = Suit.valueOf("DIAMONDS")
println(diamonds)

for (suit in Suit.values()) {
  println("${suit.name} -- ${suit.ordinal}")
}
