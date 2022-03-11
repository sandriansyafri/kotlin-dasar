fun main(){

      val members : Array<String>  = arrayOf("Sandrian","Hafid","Fikri");
      val numbers : Array<Int?>  = arrayOfNulls(10);
      numbers[0]  = 1
      numbers[2]  = 2
      numbers[3]  = 3
      numbers[4]  = 4
      numbers[5]  = 5

      println(members[0])
      println(members[1])
      println(members[2])

      println("-----------------")
      println(numbers.size)
      
      println("-----------------")
      numbers.set(0, 10)
      println(numbers[0])


}