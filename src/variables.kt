fun main() {
    println("Hola Mundo")
    var entero: Int = 20
    var altura: Double = 1.80
    var peso: Float = 80.5f
    var hombre: Boolean = true
    var numeros: Long = 56465465484984
    var name1: String = "selina kyle"

    println("hola soy $name1 tengo $entero años mido $altura y peso $peso ")

    //variable String
    var name: String = "selina kyle"
    println(name)
    var nameLength: Int = name.length
    println(nameLength)
    var nameIsEmpty: Boolean = name.isEmpty()
    println(nameIsEmpty)
    var nameContains: Boolean = name.contains("selina")
    println(nameContains)
    nameContains = name.contains("emma")
    println(nameContains)
    var mySubString: String = name.substring(2, 5)
    println(mySubString)
    var myReplace: String = name.replace("e", "o")
}