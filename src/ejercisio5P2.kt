import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    val titleArray = arrayOf<String>("Jumanji","“Toy Story","Pulp Fiction","Batman: El caballero de la noche","Kill Bill")

    var maxLength = 0
    var longestTitle = ""
    for (title in titleArray){
        val titleLength = title.length
        if (titleLength > maxLength){
            maxLength = titleLength
            longestTitle = title
        }
    }
    println(longestTitle)
}