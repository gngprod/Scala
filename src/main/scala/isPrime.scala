
object isPrime extends App {
  import scala.annotation.tailrec
  import scala.io.StdIn._

  @tailrec
  def loop(out: List[String] = Nil): List[String] = {
    val in: String = readLine()
    if (in == "END") out
    else loop(out :+ in)
  }
  val list: List[Int] = loop().map(_.toInt)
  val res0 = list.zipWithIndex.filter(pair => pair._2 % 2 == 1).map(pair => pair._1 * 2).sum
  println(res0)
}
