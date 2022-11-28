import scala.annotation.tailrec
import scala.io.StdIn._


object Functions extends App {

  val n: Int = readInt()

  def powerOfTwo(x: Int, y: Int, n: Int): String = {
    @tailrec
    def loop(a: Int, x1: Int = x): BigInt = {
      if (a == 0) x1 else loop(a - 1, x1 + y)
    }

    val i = loop(n).toString
    val ln: Int = i.length

    @tailrec
    def rez(l: Int, acc: String = i): String = {
      if (l == 0) acc else rez (l -1, acc + " " + i)
    }
    rez(ln)
  }
  println(powerOfTwo(10,1,5))
}
