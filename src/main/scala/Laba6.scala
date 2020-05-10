//8.	Отсортировать в коллекции все слова по длине.

//8.	Вернуть последний элемент списка.

//8.	Разбить строку на подстроки с ',' в качестве разделителя.
//IN: "Trust me, I'm a programmer"
//OUT: List("Trust me", " I'm a programmer")


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
