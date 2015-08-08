object prob32 {
  def main(args: Array[String]) {
    var productSet:Set[Int] = Set()
    for (a <- 2 to 99) {
      for (b <- 100 to 9999) {
        if (isPandigital(a, b, a*b)) {
          productSet += a*b
        }
      }
    }
    println(productSet.sum)
  }

  def isPandigital(mult1: Int, mult2: Int, prod: Int) : Boolean = {
    val str = ""+mult1+mult2+prod
    str.length == 9 && !str.contains("0") && str.toCharArray.toSet.size == 9
  }
}
