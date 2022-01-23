fun main() {
    val lotr = movie("La comunidad del anilllo", 40)
    //lotr.trailerPlay()

    val frames = movie.getTotalFrames(lotr.duration, true)
    println("Total Frames is $frames")



}