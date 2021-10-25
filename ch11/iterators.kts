data class Person(val firstName: String, val age: Int)

val people = listOf(
  Person("Sara", 12),
  Person("Jill", 51),
  Person("Paula", 23),
  Person("Paul", 25),
  Person("Mani", 12),
  Person("Jack", 70),
  Person("Sue", 10),
)

val result = people.filter { person -> person.age > 20 }
  .map { person -> person.firstName }
  .map { name -> name.uppercase() }
  .joinToString(", ")

println(result)

val totalAge = people.map { person -> person.age }
  .sum()

println(totalAge)

val nameOfFirstAdult = people.filter { person -> person.age > 17 }
  .map { person -> person.firstName }
  .last()

println(nameOfFirstAdult)

val families = listOf(
  listOf(Person("Jack", 40), Person("Jill", 40)),
  listOf(Person("Eve", 18), Person("Adam", 18)),
)
println(families.size)
println(families.flatten().size)

val namesAndReversed = people.map { person -> person.firstName }
  .map(String::lowercase)
  .flatMap { name -> listOf(name, name.reversed()) }

println(namesAndReversed.size)

val namesSortedByAge = people.filter { it.age > 17 }
  .sortedByDescending { it.age }
  .map { it.firstName }

println(namesSortedByAge)

val groupBy1stLetter = people.groupBy { it.firstName.first() }

println(groupBy1stLetter)

val namesBy1stLetter =
people.groupBy({ it.firstName.first() }) { it.firstName }
println(namesBy1stLetter)

