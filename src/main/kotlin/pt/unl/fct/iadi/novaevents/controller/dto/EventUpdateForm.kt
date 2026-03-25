package pt.unl.fct.iadi.novaevents.controller.dto

import org.springframework.format.annotation.DateTimeFormat
import pt.unl.fct.iadi.novaevents.model.EventType
import java.time.LocalDate

data class EventUpdateForm(
    val name: String? = null,

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    val date: LocalDate? = null,

    val type: String? = null,

    val location: String? = null,
    val description: String? = null
)