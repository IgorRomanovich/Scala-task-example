package Lectures.week1basics

import scala.annotation.tailrec
import scala.io.StdIn._

object StringOperations extends App {
  val s = scala.io.StdIn.readLine().toString.replaceAll(" +", " ").split(" ").toList
  val len = s.length
  val l = 5
  @tailrec
  def rez(l: Int, acc: String = s.lift(len).mkString("")): String = {
    val i = s.lift(l - 1).mkString("")
    if (l == -1) acc else rez(l - 1, acc + " " + i)
  }

  print(rez(len).trim)
}
