fun main(){
      var name: String = "Sandrian Syafri"
      var address: String = """ 
            |Jl.Guru, 
            |RT 006 
            |RW 002 
            |Kel.Cadika 
            |Kec.Rimbo Tengah
      """.trimMargin()

      var address_2: String = """ 
            >Jl.Guru, 
            >RT 006 
            >RW 002 
            >Kel.Cadika 
            >Kec.Rimbo Tengah
      """.trimMargin(">")

      var firstName: String = "Sandrian"
      var lastName: String = "Syafri"
      var fullname = "${firstName} ${lastName}"
      var length_chars : Int = firstName.length + lastName.length;

      println(name)
      println(address)
      println("-----------------------")
      println(address_2)
      println("-----------------------")
      println("${fullname} (${length_chars})")



}