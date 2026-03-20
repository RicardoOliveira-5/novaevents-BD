package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.service

import org.springframework.cglib.core.Local
import org.springframework.stereotype.Service
import pt.unl.fct.iadi.novaevents.controller.dto.EventForm
import pt.unl.fct.iadi.novaevents.controller.dto.EventsResponse
import pt.unl.fct.iadi.novaevents.model.Event
import pt.unl.fct.iadi.novaevents.model.EventType
import java.time.LocalDate


@Service
class EventsService {

    val events = mutableListOf<Event>(
        Event(1,1,"Beginner's Chess Workshop", LocalDate.parse("2026-03-16"), "Room A101", EventType.WORKSHOP),
        Event(2, 1, "Spring Chess Tournament", LocalDate.parse("2025-10-20"), "Room A", EventType.COMPETITION),
        Event(3, 2, "A workshop for robotics enthusiasts", LocalDate.parse("2025-11-15"), "Lab 3", EventType.WORKSHOP),
        Event(4, 3, "A photo walk for photography enthusiasts", LocalDate.parse("2025-12-05"), "Campus Garden", EventType.SOCIAL),
        Event(5, 4, "A hiking trip", LocalDate.parse("2025-09-10"), null, EventType.SOCIAL),
        Event(6, 5, "A film Screening", LocalDate.parse("2025-10-30"), "Auditorium", EventType.OTHER),

    )



    fun getEventsForClub(type: EventType? = null,clubId: Long?, start: LocalDate?, end: LocalDate? ): List<Event> {
        return events.filter { event ->
            (clubId == null || event.clubId == clubId) &&
            (type == null || event.type == type) &&
            (start == null || !event.date.isBefore(start)) &&
            (end == null || !event.date.isAfter(end))
        }
    }
    fun findById(id: Long): Event {
        return events.firstOrNull { it.id == id }
            ?: throw NoSuchElementException("Event with id $id not found")
    }

    fun createEvent(event: EventForm, id: Long): Event {
        val newId = (events.maxOfOrNull { it.id } ?: 0) + 1
        val newEvent = Event(
            id = newId,
            clubId = id,
            name = event.name ?: throw IllegalArgumentException("Name is required"),
            date = event.date ?: throw IllegalArgumentException("Date is required"),
            type = event.type ?: throw IllegalArgumentException("Type is required"),
            location = event.location,
            description = event.description
        )
        events.add(newEvent)
        return newEvent
    }

    fun updateEvent(event: Event) {
        val index = events.indexOfFirst { it.id == event.id }
        if (index != -1) {
            events[index] = event
        }
    }


    fun deleteEvent(id: Long): Unit {
        val index = events.indexOfFirst { it.id == id }
       events.removeAt(index)
        print(events.size)
    }

    fun nameExists(name: String, clubId: Long): Boolean {
        return events.any { it.name == name && it.clubId == clubId }
    }
    fun nameEditExists(name: String, clubId: Long, excludeId: Long? = null): Boolean {
        return events.any { it.name == name && it.clubId == clubId && it.id != excludeId }
    }

}