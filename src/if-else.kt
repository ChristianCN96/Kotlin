fun main() {
    var episodios = 45
     if (episodios == 1){
         println("Estas viendo una pelicula")
     } else if (episodios > 1 && episodios <= 5){
         println("Estas viendo una miniserie")
     }else if (episodios > 6 || episodios >100){
         println(" Estas viendo una serie")
     }else {
         println("pon al menos un capitulo")
     }
}