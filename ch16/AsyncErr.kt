import kotlin.system.*
import kotlinx.coroutines.*

fun main() = runBlocking {
  val airportCodes = listOf("LAX", "SF-", "PD-", "SEA")

  val airportData = airportCodes.map { anAirportCode ->
    async(Dispatchers.IO + SupervisorJob()) {
      Airport.getAirportData(anAirportCode)  
    }
  }

  for (anAirportData in airportData) {
    try {
      val airport = anAirportData.await()

      println("${airport?.code} delay: ${airport?.delay}")
    } catch(ex: Exception) {
      println("ERROR: ${ex.message?.substring(0..28)}")
    }  
  }
}
