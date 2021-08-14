val fruits: List<String> = listOf("Apple", "Banana", "Grape")
println(fruits::class)
println(fruits.javaClass)
println(fruits)
println("first's ${fruits[0]}, that's ${fruits.get(0)}")
println(fruits.contains("Apple"))
println("Apple" in fruits)

val fruits2 = fruits + "Orange"
println(fruits)
println(fruits2)

val noBanana = fruits - "Banana"
println(noBanana)

val fruits3: ArrayList<String> = arrayListOf("Apple", "Banana", "Grape")
println(fruits3::class)
fruits3.add("Orange")
println(fruits3)

