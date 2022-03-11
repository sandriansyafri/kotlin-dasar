fun main(){

      // without underscore in number : 30000000 [ not-readable ]

      // Integer Number
      // with underscore in number : 30_000_000 [ readable ]
      var typeByte: Byte = 30 // Byte : [-128 - 127 ]  
      var typeShort: Short = 168 // Short :  [ -32768 - 32767 ] 
      var typeInt: Int = 3_000 // Int : [ - 2.147.483,648 (-2^31) -  2.147.483,647 (2^31 - 1) ]
      var typeLong: Long = 4_000_000L // Long : [ -9.223.327.036.854.775.808 (-2^63) - 9.223.327.036.854.775.808 (2^63 - 1) ]

      // Float Point Number
      var typeFloat: Float = 30.02F
      var typeDouble: Double = 3.02
      
      // Literals
      var typeDecimalLiteral:Int = 3000
      var typeHexLiteral = 0xaaafff
      var typeBinaryLiteral = 0b0001001

      // Conversion variable_name.to[conversionType]
      /*
            example 
            var number:Int  = 9_000_000
            number.toShort
            number.toByte
            ....

            note : ketika melakukan konversi perlu diperhatikan overflow konversion
            contoh : 9_000_000 konversi ke Short 
                  ini akan mengalami overflow konversion 

       */ 
      

      println(typeByte)
      println(typeShort)
      println(typeInt)
      println(typeLong)
      println("-----------------")
      
      println(typeFloat)
      println(typeDouble)
      println("-----------------")
      
      println(typeDecimalLiteral)
      println(typeHexLiteral)
      println(typeBinaryLiteral)
      println("-----------------")

      


}