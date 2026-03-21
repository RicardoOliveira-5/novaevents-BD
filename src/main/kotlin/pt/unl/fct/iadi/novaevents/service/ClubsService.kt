package pt.unl.fct.iadi.novaevents.service

import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Service
import pt.unl.fct.iadi.novaevents.model.Club
import pt.unl.fct.iadi.novaevents.repository.ClubRepository


@Service
class ClubsService(
    private val clubRepository: ClubRepository

) {

    /*
    val clubs = mutableListOf(
        Club(1, "Chess Club", "The Robotics Club is the place to turn ideas into machines", (ClubCategory.SOCIAL)),
        Club(2, "Robotics Club", category = ClubCategory.ACADEMIC, description = "The Robotics Club is the place to turn ideas into machines"),
        Club(3, "Photography Club", "A club for photography enthusiasts", (ClubCategory.CULTURAL)),
        Club(4, "Hiking & Outdoors Club", "A club for hiking and outdoor enthusiasts", (ClubCategory.SPORTS)),
        Club(5, "Film Society Club", "A club for film lovers", (ClubCategory.CULTURAL))
    )

     */

    fun getAllClubs(): List<Club> {
        return clubRepository.findAll()
    }
    fun clubDetails(clubId: Long?): Club {
        return clubId?.let { id ->
            clubRepository.findById(id)
                .orElseThrow { EntityNotFoundException("Club not found") }
        } ?: throw IllegalArgumentException("Club ID is required")
    }
    }

