package uz.itschool.lessonnavigation.Model

data class Country(
    var name: String,
    var population: String,
    var area: String,
    var img: Int,
    var status:Boolean = false
) : java.io.Serializable