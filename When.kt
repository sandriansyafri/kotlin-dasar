fun main(){
      // TODO 1
      // val finalExam: Char= 'A';
      // when(finalExam){ 
      //       'A' -> {
      //             println("SB")
      //       }
      //       'B' -> {
      //             println("B")
      //       }
      //       'C' -> {
      //             println("TB")
      //       }
      //       'D' -> {
      //             println("STB")
      //       }
      //       else -> {
      //             println("Something Else!")
      //       }
      // }

      // TODO 2
      //   val finalExam: Char= 'A';
      //   when(finalExam){
      //         'A','B','C' -> {
      //               println("Pass")
      //         } 
      //         else -> println("Try Again!")
      //   }

      // TODO 3
      val finalExam: Char = 'E';
      val passValues: Array<Char> = arrayOf('A','B','C');
      when(finalExam){
            in(passValues) -> println("Pass")
            !in(passValues) -> println("Try Again!")
      }

      val name:String = "Sandrian";
      when(name){
            is String -> println("true")
            !is String ->println("false")
      }

      val gradeFinalExam:Int = 74;

      when{
            gradeFinalExam >= 75 -> println("PASS")
            else -> println("NOT PASS")
      }

}