fun process(card: Card) = when (card) {
  is Ace -> "${card.javaClass.name} of ${card.suit}"
  is King, is Queen, is Jack -> "$card"
  is Pip -> "${card.number} of ${card.suit}"
}

fun main() {
  println(process(Ace(Suit.DIAMONDS)))
  println(process(Queen(Suit.CLUBS)))
  println(process(Pip(Suit.SPADES, 2)))
  println(process(Pip(Suit.HEARTS, 6)))
}