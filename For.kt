fun main(){
      // TODO 1
      // val numbers:Array<Int> = arrayOf(1,2,3,4,5) 
      // for(number in numbers){
      //       println(number)
      // }

      // TODO 2
      val ranges = 1..10 step 3;
      for(range in ranges){
            println(range)
      }
      
      // TODO 3
      val names:Array<String> = arrayOf("Sandrian","Hafid","Yogi");
      val lengthArray:Int = names.size - 1;
      for(i in 0..lengthArray){
            println("index ke - ${i} : ${names[i]}")
      }

}