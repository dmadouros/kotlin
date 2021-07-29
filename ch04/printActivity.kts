fun printWhatToDo(dayOfWeek: Any) {
  when (dayOfWeek) {
    "Saturday", "Sunday" -> println("Relax")
      in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> println("Work hard")
      in 2..4 -> println("Work hard")
      "Friday" -> println("Party")
      is String -> println("What?")
  }
}

printWhatToDo("Sunday")
printWhatToDo("Wednesday")
printWhatToDo(3)
printWhatToDo("Friday")
printWhatToDo("Munday")
printWhatToDo(8)

