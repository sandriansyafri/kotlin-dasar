fun sayHello(firstName: String, lastName: String?){
      when {
            lastName == null -> println("Hello ${firstName}!")
            else ->  println("Hello ${firstName} ${lastName}")
      }

}

fun main(){
      sayHello("Sandrian",null)
}