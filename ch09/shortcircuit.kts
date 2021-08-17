fun getTemperature(city: String): Double {
  println("fetch from webservice for $city")

  return 30.0
}

val showTemperature = false
val city = "Boulder"

val temperature = getTemperature(city)
if (showTemperature && temperature > 20)
  println("Warm")
else
  println("Nothing to report")

