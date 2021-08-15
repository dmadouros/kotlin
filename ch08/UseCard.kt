fun process(card: Card) = when (card) {
  is Ace -> "${card.javaClass.name} of ${card.suit}"
  is King, is Queen, is Jack -> "$card"
  is Pip -> "${card.number} of ${card.suit}"
}

fun main() {
  println(process(Ace("Diamond")))
  println(process(Queen("Clubs")))
  println(process(Pip("Spades", 2)))
  println(process(Pip("Hearts", 6)))
}