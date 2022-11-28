import scala.io.StdIn.readInt
object exm {
  def fibs(num: Int):Int = {
    if (num == 1) 1
    else if (num == 2) 1
    else fibs(num - 1) + fibs(num - 2)
  }
  def sl ( num :Int ):Int={
     if (num > 4)
       num
     else sl(num + 1)
  }
  def main ( args: Array[String]): Unit ={
   /* val num = readInt()
   print( fibs(num))*/
   val n: Int= readInt()
   println(sl(n))
   print (fibs(n))
  }


}
