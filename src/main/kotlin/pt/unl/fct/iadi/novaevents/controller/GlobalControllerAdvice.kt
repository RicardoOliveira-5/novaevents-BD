package pt.unl.fct.iadi.novaevents.controller

import org.springframework.http.HttpStatus
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.ResponseStatus
import pt.unl.fct.iadi.novaevents.model.EventType
import pt.unl.fct.iadi.novaevents.service.EventsService
import pt.unl.fct.iadi.service.ClubNotFoundException


@ControllerAdvice
class GlobalControllerAdvice(private val eventsService: EventsService) {

    @ExceptionHandler(ClubNotFoundException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleClubNotFoundException(ex: ClubNotFoundException, model: Model): String {
        model.addAttribute("message", ex.message)
        return "error/404"
    }

    @ExceptionHandler(NoSuchElementException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNoSuchElement(ex: NoSuchElementException, model: Model): String {
        model.addAttribute("message", ex.message)
        return "error/404"
    }

    @ModelAttribute("eventTypes")
    fun eventTypes() = eventsService.getAllEventsTypes()
}