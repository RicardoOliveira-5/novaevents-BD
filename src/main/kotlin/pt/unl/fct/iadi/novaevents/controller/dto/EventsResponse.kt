package pt.unl.fct.iadi.novaevents.controller.dto

import pt.unl.fct.iadi.novaevents.model.EventType
import java.time.LocalDate

data class EventsResponse(
    val id: Long,
    val name: String,
    val clubId: Long,
    val clubName: String,
    val date: LocalDate,
    val type: EventType,
    val location: String?
)