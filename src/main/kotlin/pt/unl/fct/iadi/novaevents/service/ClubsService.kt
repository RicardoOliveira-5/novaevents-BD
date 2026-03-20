package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.service

import org.springframework.stereotype.Service
import pt.unl.fct.iadi.novaevents.model.Club
import pt.unl.fct.iadi.novaevents.model.ClubCategory


@Service
class ClubsService {
    // Cria 5 clubes, de chess, robotics, music, photography, hiking and outdoors club and film society club
    val clubs = mutableListOf(
        Club(1, "Chess Club", "The Robotics Club is the place to turn ideas into machines", (ClubCategory.SOCIAL)),
        Club(2, "Robotics Club", category = ClubCategory.ACADEMIC, description = "The Robotics Club is the place to turn ideas into machines"),
        Club(3, "Photography Club", "A club for photography enthusiasts", (ClubCategory.CULTURAL)),
        Club(4, "Hiking & Outdoors Club", "A club for hiking and outdoor enthusiasts", (ClubCategory.SPORTS)),
        Club(5, "Film Society Club", "A club for film lovers", (ClubCategory.CULTURAL))
    )

    fun getAllClubs(): List<Club> {
        return clubs
    }
    fun clubDetails(clubId: Long?): Club {
        return clubs.find { it.id == clubId } ?: throw ClubNotFoundException("Club not found")
    }

}