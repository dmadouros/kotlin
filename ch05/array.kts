val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")
println(friends::class)
println(friends.javaClass)
println("${friends[0]} and ${friends[1]}")

val numbers = intArrayOf(1, 2, 3)
println(numbers::class)
println(numbers.javaClass)
println(numbers.size)
println(numbers.average())

println(Array(5) { i -> (i + 1) * (i + 1) }.sum())

