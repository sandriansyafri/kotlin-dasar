fun handlePlus(val1: Int , val2:Int): Int{
      return val1 + val2
}

fun handleMin(val1: Int , val2:Int): Int{
      return val1 - val2
}

fun handleMultiple(val1: Int , val2:Int): Int{
      return val1 * val2
}

fun main(){

      val x: Int = 20;
      val y: Int = 10;

      val resultHandlePlus:Int = handlePlus(x, y)
      val resultHandleMin:Int = handleMin(x, y)
      val resultHandleMultiple:Int = handleMultiple(x, y)

      println(resultHandlePlus)
      println(resultHandleMin)
      println(resultHandleMultiple)

}