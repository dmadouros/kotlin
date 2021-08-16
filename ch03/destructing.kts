fun getFullName() = Triple("John", "Quincy", "Adams")

//val result = getFullName()
//val first = result.first
//val middle = result.second
//val last = result.third

val (_, middle) = getFullName()

println("$middle")

