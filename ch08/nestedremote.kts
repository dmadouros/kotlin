interface Remote {
  fun up()
  fun down()
 
  fun doubleUp() {
    up()
    up()
  }
}

class TV { 
  private var volume = 0

  val remote: Remote get() = object: Remote {
    override fun up() { volume++ }
    override fun down() { volume-- }

    override fun toString() = "Remote: ${this@TV.toString()}"    
  }

  override fun toString(): String = "Volume: ${volume}"
}

val tv = TV()
val remote = tv.remote

println("$tv")
remote.up()
println("After increasing: $tv")
remote.doubleUp()
println("After doubleUp: $tv")
println(remote)
