var doubleOfEven = mutableListOf<Int>()

for (i in 1..10) {
  if (i % 2 == 0) {
    doubleOfEven.add(i * 2)
  }
}

println(doubleOfEven)

val doubleOfEven2 = (1..10)
  .filter { e -> e % 2 == 0 }
  .map { e -> e * 2 }

println(doubleOfEven2)

