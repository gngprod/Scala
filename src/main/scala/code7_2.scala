object code7_2 extends App {
  trait StringProcessor {
    def process(input: String): String
  }

  val tokenDeleter = new StringProcessor {
    def process(input: String): String = input.replaceAll("[,:;]", "")
  }
  val shortener = new StringProcessor {
    def process(input: String):String = input.toLowerCase()
  }

  val toLowerConvertor = new StringProcessor {
    def process(input: String): String = {
      if (input.length >= 20) input.take(20) + "..."
      else input
    }
  }

  val x = "123456789012345678901234567890"
  if (x.length >= 20) x.take(20) + "..."
  else x
}
