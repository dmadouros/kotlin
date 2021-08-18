fun send(n: Int) = println(n)

object Terminal {
  fun write(value: Int) = println(value)
}

fun walk1To(n: Int, action: (Int) -> Unit) = 
  (1..n).forEach { action(it) }

walk1To(5, Terminal::write)
println()

