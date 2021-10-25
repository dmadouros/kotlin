import kotlinx.coroutines.*
import java.util.concurrent.Executors

suspend fun task1() {
  println("start task1 in Thread ${Thread.currentThread()}")
  yield()
  println("end task1 in Thread ${Thread.currentThread()}")
}

suspend fun task2() {
  println("start task2 in Thread ${Thread.currentThread()}")
  yield()
  println("end task2 in Thread ${Thread.currentThread()}")
}

runBlocking(CoroutineName("top")) {
  println("starting in Thread ${Thread.currentThread()}")
  withContext(Dispatchers.Default) { task1() }
  launch(Dispatchers.Default + CoroutineName("task runner")) { task2() }
  println("ending in Thread ${Thread.currentThread()}")
}
