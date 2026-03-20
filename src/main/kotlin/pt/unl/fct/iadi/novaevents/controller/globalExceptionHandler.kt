package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import pt.unl.fct.iadi.novaevents.service.ClubNotFoundException
import pt.unl.fct.iadi.novaevents.service.EventNotFoundException


data class ApiError(val error: String, val message: String)

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ClubNotFoundException::class)
    fun  handleClubNotFoundException(message: String)  =
        ResponseEntity(ApiError("NOT_FOUND", message), HttpStatus.NOT_FOUND)

    @ExceptionHandler(EventNotFoundException::class)
    fun handleEventNotFoundException(message: String) =
        ResponseEntity(ApiError("NOT_FOUND", message), HttpStatus.NOT_FOUND)


}