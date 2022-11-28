import scala.annotation.tailrec
import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    def powerOfTwo(x: Int, y: Int, z: Int): String = {
      @tailrec
      def loop(n: Int, a: Int = x, b: Int = y): BigInt = {
        if (n == 0) a else loop(n - 1, a + b)
      }

      val tmp = loop(z).toString
      val ln = tmp.size

      @tailrec
      def arr(l: Int, k: String = tmp): String = {
        if (l == 1) k else arr(l - 1, k + " " + tmp)
      }

      arr(ln, tmp)
    }
  }

  class Student(var id: Int, val name: String) {
    val uni = "univer"
  }




  object OOpBasic extends App {
    val student = new Student(0, "Bob")

    println(student.uni)
  }

}

