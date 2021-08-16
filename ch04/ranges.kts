val oneToFive: IntRange = 1..5

val aToE: CharRange = 'a'..'e'

val seekHelp: ClosedRange<String> = "hell".."help"

println(seekHelp.contains("helm"))
println(seekHelp.contains("helq"))

for (i in 1..5) { print("$i, ") }
println()

for (ch in 'a'..'e') { print(ch) }
println()

