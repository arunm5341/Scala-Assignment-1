object Question2 {
  def main(args: Array[String]): Unit = {
    def removes ( s : String , n : Int) : String =
      {
        s.take(n) + s.drop(n+1)
      }
  println(removes("Arun",2))

  }

}
