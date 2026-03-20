package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.service

class EventNotFoundException(id: Long) : RuntimeException("Event with ID $id not found")