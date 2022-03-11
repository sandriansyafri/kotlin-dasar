const val APP = "Belajar Kotlin"
const val VERSION  = "0.0.1"

fun main(){

      /*
            variable ada 2 
                  1. var = muttable 
                  2. val = immuttable

            variable boleh null 
            variable bisa kita jadikan constanta ( dapat diakses dari manaput )

      */

      var firstName: String = "Sandrian"
      firstName = "Syafri"
      val age: Int = 90

      var address:String? = null
      address = "hehehe"

      println(firstName)
      println(age)
      println(address)
      println(address?.length)

      println("${APP} :  ${VERSION")


}