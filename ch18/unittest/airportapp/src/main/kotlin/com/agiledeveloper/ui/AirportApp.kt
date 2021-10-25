package com.agiledeveloper.ui

import com.agiledeveloper.airportstatus.getAirportStatus
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    getAirportStatus(
        listOf(
            "SFO", "IAD", "IAH", "ORD", "LAX", "DEN", "MSP", "SNA", "BOS",
            "PHX", "DFW", "BNA", "FLL", "MIA", "MCO", "TPA"
        )
    )
        .forEach { println(it) }
}
