fun main() {
   /* var intArray = intArrayOf( 1, 2, 3, 4, 5)
    var arreglo = booleanArrayOf(true, false, true, false)

    println(intArray[3])
    println(arreglo[0])*/

    var playList = arrayOf("toy story", "Iro Man", "Lor of the ring", "Harry poter", "I am Legend", "Back to the future")

    for (movie in playList){
        println(movie)
    }

    var intArray = intArrayOf(1, 2, 3, 4, 5)

    var total = 1

    for (valor in intArray){
        total *= valor
    }
    println(total)
}