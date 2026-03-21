package pt.unl.fct.iadi.novaevents.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Club(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,

    @Column(length = 2000)
    val description: String,

    @Enumerated(EnumType.STRING)
    val category: ClubCategory =  ClubCategory.SOCIAL
) {

        constructor(): this(0, "", "", ClubCategory.SOCIAL)

}