fun String.isPalindrome(): Boolean {
  return reversed() == this
}
fun String.shout() = uppercase()

val str = "dad"
println(str.isPalindrome())
println(str.shout())

