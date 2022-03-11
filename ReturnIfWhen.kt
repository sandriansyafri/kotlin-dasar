fun main(){
      // TODO 1
      // fun sayHello(firstName: String = ""):String {
      //       return if(firstName == ""){
      //              "Hello!"
      //       } else {
      //             "Hello ${firstName}"
      //       }
      // }

      // println(sayHello());
      // println(sayHello("Sandrian"));

      // TODO 2
      fun sayHello(firstName: String = ""): String{
            return when {
                  firstName == "" -> "Hello!"
                  else -> "Hello ${firstName}!"
            }
      }

      println(sayHello())
      println(sayHello("Sandrian"))

}