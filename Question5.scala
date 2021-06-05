object Question5 {
  def main(args: Array[String]): Unit = {

    var x : Int = 100

    var y : Int = 98

    var z : Int = 102

    var lesser : Int = x-y

    var greater : Int = z-x

    if (greater > lesser) println(z)

    else if (greater < lesser) println(y)

    else println(0)

  }


}
