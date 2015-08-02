object prob79 {
  def main(args: Array[String]): Unit = {
    val keys:List[Int] = scala.io.Source.fromFile("keylog.txt").getLines().map(_.toInt).toList
    for (i <- 0 to 999999999) {
      if (keys.forall(isValid(_, i))) {
        println(i)
        return
      }
    }
  }

  def isValid(key: Int, source: Int) : Boolean = {
    val keyStr = ""+key
    val sourceStr = ""+source
    val midChar = sourceStr.indexOf(keyStr.charAt(1))
    val leftChar = sourceStr.indexOf(keyStr.charAt(0))
    val rightChar = sourceStr.indexOf(keyStr.charAt(2))
    leftChar >= 0 && leftChar < midChar && midChar < rightChar
  }
}
