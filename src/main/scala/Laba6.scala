
object Laba6 {

    def main(args: Array[String]): Unit = {
      val strList = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
      val tempstrlist = strList.sortBy(_.length)                                                               // part 1
      tempstrlist.foreach(System.out.println)                                                                  // part 1
      System.out.println(strList.last)                                                                         // part 2
      val str = "Trust me, I'm a programmer"                                                                   // part 3
      val tempstr = str.split(",")                                                                             // part 3
      tempstr.foreach(System.out.println)                                                                     // part 3
    }

}
