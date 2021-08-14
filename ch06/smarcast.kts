class Animal(val age: Int) {
  override operator fun equals(other: Any?): Boolean {
    return other is Animal && age == other.age
  }
}

val odie = Animal(2)
val toto = Animal(2)
val butch = Animal(3)
println(odie == toto)
println(odie == butch)

