package pt.unl.fct.iadi.pt.unl.fct.iadi.novaevents.model

data class Club(
    val id: Long,
    val name: String,
    val description: String,
    val category: ClubCategory =  ClubCategory.SOCIAL
) {
    init {
        require(name.isNotBlank()) { "Club name cannot be blank" }
        require(description.isNotBlank()) { "Club description cannot be blank" }
    }
}