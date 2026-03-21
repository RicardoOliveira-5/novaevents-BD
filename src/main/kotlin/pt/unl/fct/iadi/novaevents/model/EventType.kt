package pt.unl.fct.iadi.novaevents.model

import jakarta.persistence.*

@Entity
data class EventType(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var name: String = ""
) {
    // Hibernate precisa de um construtor vazio
    constructor(): this(0, "")
}