object Question7 {

  def main(args: Array[String]): Unit = {
    var str : String = "ALLRGDSFBGBCCU"
    var n : Int = 8

    var c : Char = str.charAt(n)

    if((c ==str.charAt(n-1) ) || (c==str.charAt(n+1)) ) println("Happy Character")
    else println("Not Happy character")

  }

}
