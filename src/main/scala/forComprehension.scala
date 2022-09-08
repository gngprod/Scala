object forComprehension extends App {
  val list1: List[Int] = List(1, 3, 5, 7)
  val list2: List[Int] = List(2, 4, 6, 8)
  val list3: List[Int] = List(1, 3, 5, 8, 10, 12, 14)

  def out(lis1: List[Int], lis2: List[Int], lis3: List[Int]): Unit = for {
    x <- lis1
    y <- lis2 if x != y
    z <- lis3 if x * y == z
  } yield println(x,y)
  out(list1, list2, list3)
}
