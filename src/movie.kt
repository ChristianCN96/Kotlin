class movie(var movieName: String, var duration: Int, var trailer: trailer? = null, var aveilable: Boolean = true ){

    companion object{
        const val FRAME_RATE_HD = 60
        const val FRAME_RATE_SD = 25
        const val SECONDS_IN_A_MINUTE = 60

        fun getTotalFrames(duration: Int, isHd: Boolean): Int{
            return if (isHd){
                 FRAME_RATE_HD * SECONDS_IN_A_MINUTE * duration
            }else{
                return FRAME_RATE_SD * SECONDS_IN_A_MINUTE * duration
            }
        }
    }

    fun play(): Boolean {
        return if (aveilable) {
            if (duration > 0){
                for (i in 0 until duration) {
                    println("playing movie $movieName")
                }
                return true
            }else {
                println(" movie $movieName is  not aveilable is less than zero")
            }
            false
        }else {
            println(" movie $movieName is  not aveilable")
            false
        }
    }
    fun trailerPlay(){
        if (trailer == null){
            println("no movie trailer aviable")
        }else{
            trailer?.play(movieName) ?: print("No trailer available")
        }
    }

    fun pause() {
        println("movie pause")
    }

}