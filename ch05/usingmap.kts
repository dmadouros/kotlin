val sites = mapOf("pragprog" to "https://www.pragprog.com",
"agiledeveloper" to "https://agiledeveloper.com")
println(sites.size)
println(sites.containsKey("agiledeveloper"))
println(sites.containsValue("http://www.example.com"))
println(sites.contains("agiledeveloper"))
println("agiledeveloper" in sites)

val pragProgSite: String? = sites.get("pragprog")
val pragProgSite2: String? = sites.get("pragprog")
val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://www.example.com")

val sitesWithExample = sites + ("example" to "http://www.example.com")
println(sitesWithExample)
val withoutAgileDeveloper = sites - "agiledeveloper"
println(withoutAgileDeveloper)

for (entry in sites) {
  println("${entry.key} --- ${entry.value}")
}

for ((key, value) in sites) {
  println("$key --- $value")
}

