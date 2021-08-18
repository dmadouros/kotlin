val names = listOf("Pam", "Pat", "Paul", "Paula")

fun predicateOfLength(length: Int) =
  { input: String -> input.length == length }

println(names.find(predicateOfLength(5)))
println(names.find(predicateOfLength(4)))

