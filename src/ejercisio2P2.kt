import java.util.*

fun main() {

    println("Ingrese la distancia a rrecorrer")
    val distancia = readLine()!!.toDouble()
    println("¡el conductor esta disponible? (Escribe true o false)")
    val isaviable = readLine()!!.toBoolean()

    if (distancia <= 0.5 && isaviable) {
        println("Listo para iniciar el recorrido")
    }else if (distancia <= 0.5 && !isaviable){
        println("Conductor cercano pero no diponible")
    }else if (distancia > 0.5 && isaviable){
        println("conductor disponible pero muy lejos aplicara tarifas mas caras")
    }else if (distancia > 0.5 && !isaviable){
        println("NO HAY CONDUCTORES DIPONIBLES")
    }


}