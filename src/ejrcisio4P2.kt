fun main() {
    println("Inserte el clima escogiendo un numero del 1 al 5")
    val number = readLine()!!.toInt()

    when (number){
        1 -> {
            println("Soleado")
        }
        2 -> {
            println("Nublado")
        }
        3 -> {
            println("Lluvioso")
        }
        4 -> {
            println("Tormentoso")
        }
        5 -> {
            println("Nevado")
        }
        else -> {
        println("Preguntale a google")
        }
    }
}