val names = listOf("Pam", "Pat", "Paul", "Paula")

//val checkLength5 = {name: String -> name.length == 5 }
//val checkLength5: (String) -> Boolean = { name -> name.length == 5 }
val checkLength5 = fun(name: String): Boolean { return name.length == 5 }
println(names.find(checkLength5))
println(names.find(fun(name: String): Boolean { return name.length == 5 }))

