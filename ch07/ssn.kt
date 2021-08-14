inline class SSN(val id: String)

fun receiveSSN(ssn: SSN) {
  println("Received $ssn")
}

receiveSSN(SSN("111-11-1111"))

