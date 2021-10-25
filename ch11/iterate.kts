val numbers = listOf(10, 12, 15, 17, 18, 19)

for (i in numbers) {
  if (i % 2 == 0) {
    print("$i, ")
  }
}
println()

numbers.filter { e -> e % 2 == 0 }
  .forEach { e -> print("$e, ") }
println()

val doubled = mutableListOf<Int>()

for (i in numbers) {
  if (i % 2 == 0) {
    doubled.add(i * 2)
  }
}

println(doubled)

val doubledEven = numbers.filter { e -> e % 2 == 0 }
  .map { e -> e * 2 }

println(doubledEven)

