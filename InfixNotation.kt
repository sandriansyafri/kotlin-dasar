infix fun String.to(type: String): String{
      if(type == "UP"){
            return this.toUpperCase()
      } else {
            return this
      }
}

fun main(){
      var result: String = "hello" to "UP";
      println(result);     
}