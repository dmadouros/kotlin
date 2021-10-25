class Mailer {
  val details = StringBuilder()
  fun from(addr: String) = details.append("from $addr...\n")
  fun to(addr: String) = details.append("to $addr...\n")
  fun subject(line: String) = details.append("subject $line...\n")
  fun body(message: String) = details.append("body $message...\n")
  fun send() = "...sending...\n$details"
}

val mailer = Mailer()
mailer.from("build@agiledeveloper.com")
mailer.to("venkat2@agiledeveloper.com")
mailer.subject("Your code sucks")
mailer.body("...details...")
var result = mailer.send()
println(result)

val mailer2 = Mailer()
  .apply { from("builder@agiledeveloper.com") }
  .apply { to("venkats@agiledeveloper.com") }
  .apply { subject("Your code sucks") }
  .apply { body("details") }
result = mailer2.send()
println(result)

val mailer3 = Mailer().apply {
  from("builder@agiledeveloper.com")
  to("venkats@agiledeveloper.com")
  subject("Your code sucks")
  body("details")
}
result = mailer3.send()
println(result)

result = Mailer().run {
  from("builder@agiledeveloper.com")
  to("venkats@agiledeveloper.com")
  subject("Your code sucks")
  body("details")
  send()
}
println(result)

fun createMailer() = Mailer()
fun prepareAndSend(mailer: Mailer) =
  mailer.run {
    from("builder@agiledeveloper.com")
    to("venkats@agiledeveloper.com")
    subject("Your code sucks")
    body("details")
    send()
  }

println("mailer5")
val mailer5 = createMailer()
result = prepareAndSend(mailer5)
println(result)

println("mailer6")
result = createMailer().let(::prepareAndSend)
println(result)

println("mailer7")
fun prepareMailer(mailer: Mailer): Unit {
  mailer.run {
    from("builder@agiledeveloper.com")
    to("venkats@agiledeveloper.com")
    subject("Your code sucks")
    body("details")
  }
}

fun sendMail(mailer: Mailer): Unit {
  mailer.send()
  println("Mail sent")
}
val mailer7 = createMailer()
  .also(::prepareMailer)
  .also(::sendMail)


