data class Task(val id: Int, val name: String, val completed: Boolean, val assigned: Boolean)

val task1 = Task(1, "Create Project", false, true)
println(task1)
println("Name: ${task1.name}")
val task1Completed = task1.copy(completed = true, assigned = false)
println(task1Completed)
//val id = task1.id
//val isAssigned = task1.assigned
val (id, _, _, isAssigned) = task1
println("ID: $id Assigned: $isAssigned")

