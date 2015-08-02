object prob30 {
  def main(args: Array[String]): Unit = {
    println((2 to 999999).filter(isSum).sum)
  }

  def isSum(x: Int) : Boolean = {
    x == (""+x).map(i => math.pow(i-48, 5)).sum.toInt
  }
}
