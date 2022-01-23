import com.sun.javafx.binding.StringFormatter
import com.sun.org.glassfish.gmbal.Description

fun main() {
    println("Hola Mundo")
    var age: Int = 20
    var altura: Double = 1.80
    var peso: Float = 80.5f
    var hombre: Boolean = true
    var lonValue: Long = 56465465484984

    var name: String = "selina kyle"
    var Description = "hola soy $name tengo $age años mido $altura y peso $peso "
    var stringFormat = String.format("hola soy %s tengo %d años mido %.2f y peso %.4f ", name, age, altura, peso )

    println(stringFormat)
}