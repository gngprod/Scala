object example extends App {
  val string = "scala = [stepik] = love"

  string.indexOf("[")
  string.indexOf("'")

  def indexOf(s: String, pattern: String): Option[Int] =
    Option(s.indexOf(pattern)).filter(_ >= 0)

  indexOf(string, "[")
  indexOf(string, "'")

  def brackets(s: String): Option[(Int, Int)] =
    indexOf(s, "[").flatMap( opening =>
      indexOf(s, "]")
        .filter(_ > opening)
        .map(closing => (opening, closing))
    )
  brackets(string)
  brackets("dgdh ] sf [ shj")

  def cutBrackets(s: String): Option[String] =
    brackets(s).map{ case(opening, closing) =>
      s.substring(opening + 1, closing)
    }
  cutBrackets(string)
}