
object prob23 {
  def main(args: Array[String]): Unit = {
    val abundants:Set[Int] = (1 to 30100).filter(isAbundant).toSet
    val abundantSums:Set[Int] = abundants.subsets(2).map(_.sum).toSet ++ abundants.map(_*2)
    println((1 to 30200).filterNot(abundantSums.contains).sum)
  }

  def isAbundant(i: Int) : Boolean = {
    getFactors(i).sum > i
  }

  def getFactors(input: Int) : List[Int] = {
    val primeFactors = getPrimeFactors(input)
    primeFactors.indices.flatMap(primeFactors.combinations).map(_.product).toList
  }

  def getPrimeFactors(input: Int): List[Int] =  {
    var x = input
    var out:List[Int] = List()
    var divider = 2
    while (x > 1) {
      if (x % divider == 0) {
        out = divider :: out
        x /= divider
      } else {
        divider += 1
      }
    }
    out
  }
}
