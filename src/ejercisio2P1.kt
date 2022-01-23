fun main() {
    println("Ingrese una cantidad en miligramos")
    val cantidad: Double = readLine()!!.toDouble()

    if (cantidad >= 100){
        println("“¡Felicidades, es una buena poción multijugos!”")
    } else{
        println("“La poción\n" + "es mediocre, sangre sucia inmunda”")
    }
}