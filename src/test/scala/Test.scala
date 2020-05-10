import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite {
  test("Sort") {
    val sortedlist = List ("Monday", "Friday", "Sunday", "Tuesday", "Thursday", "Saturday", "Wednesday")
    val strList = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val str = "Trust me, I'm a programmer"
    val arraystr = Array ("Trust me", " I'm a programmer")
    assert(strList.sortBy(_.length).equals(sortedlist) && strList.last.equals("Sunday") && str.split(",") === (arraystr))
  }

}
