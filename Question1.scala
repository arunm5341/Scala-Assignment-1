object Question1 {


    def main(args: Array[String]): Unit = {


      //var str : String = "India"
      print("Enter the string :")
      var s = scala.io.StdIn.readLine()
      var result = s.substring(0, 2)
      var l : Int = s.length
      if (l==2) println(s+s+s+s)
      else
      println(result + result + result + result)

    }
  }

