package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.model

import java.time.LocalDate

data class Event (
    val id: Long,
    val clubId: Long,
    var name: String,
    var date: LocalDate,
    var location: String? = null,
    var type: EventType,
    var description: String? = null

) {
    init {
        require(name.isNotBlank()) { "Name is required" }
        requireNotNull(date) {
            "Date is required and must be in the format YYYY-MM-DD"
            require(type in EventType.values()) { "Event type is required and must be valid" }
        }
    }
}
