inline fun invokeTwo(
  n: Int,
  action1: (Int) -> Unit,
  crossinline action2: (Int) -> Unit
): (Int) -> Unit {
  println("enter invokeTwo $n")

  action1(n)
  action2(n)

  println("exit invokeTwo $n")
  //return { _: Int -> println("lambda returned from invokeTwo") }
  return { input: Int -> action2(input) }
}

fun report(n: Int) {
  println("")
  print("called with $n, ")

  val stackTrace = RuntimeException().getStackTrace()

  println("Stack depth: ${stackTrace.size}")
  println("Partial listing of the stack:")
  stackTrace.take(3).forEach(::println)
}

fun callInvokeTwo() {
  invokeTwo(1, { i -> 
    if (i == 1) { return }
    report(i) 
  }, { i -> 
    //if (i == 2) { return }
    report(i) 
  })
}

callInvokeTwo()

