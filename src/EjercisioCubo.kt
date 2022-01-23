fun main() {
    var largo = 15
    var ancho = 23
    var alto = 12
    val volumen = largo * ancho * alto
    println("el volumen del cubo es:  $volumen")


    var m = 12
    var v = 3
    var ec = .5 * m * (v*v)

    var stringFormat = String.format(" la energia cinetica es %.2f", ec)
    println(stringFormat)
}