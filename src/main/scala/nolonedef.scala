object nolonedef {
  def main(args: Array[String]): Unit = {
    import scala.annotation.tailrec

    val in: String = "0 1 1 0 1 0 0 1 1 1 0 1 0"
    val ints: List[Int] = in.split(" ").map(_.toInt).toList

    @tailrec
    def splitList(inList: List[Int],
                  nullList: Int = 0,
                  oneList: Int = 0,
                  acc: Int = 0): (Int, Int) = {
      if (inList.length == acc) (nullList, oneList)
      else if (inList(acc) == 0) splitList(inList, nullList + 1, oneList, acc + 1)
      else if (inList(acc) == 1) splitList(inList, nullList, oneList + 1, acc + 1)
      else (nullList, oneList)
    }
    val nol: String = ("0,"* splitList(ints)._1).dropRight(1)
    val one: String = ("1,"* splitList(ints)._2).dropRight(1)
    println(nol)
    println(one)
  }
}
