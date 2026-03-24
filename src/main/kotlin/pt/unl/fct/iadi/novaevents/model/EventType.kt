package pt.unl.fct.iadi.novaevents.model

import jakarta.persistence.*

@Entity
class EventType(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    var name: String = ""
) {
    // Hibernate precisa de um construtor vazio
    constructor(): this(0, "")
}