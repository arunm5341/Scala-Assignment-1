object Question3 {
  def main(args: Array[String]): Unit = {

    var str : String = "abcd"

    var x : Int = str.length

    var z : Char = str.charAt(x-1)

    println(z + str + z)
  }

}
