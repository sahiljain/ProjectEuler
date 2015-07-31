object prob29 {
  def main(args: Array[String]): Unit = {
    val factorSet:Set[List[Int]] = (2 to 100).map(getPrimeFactors).toSet
    var newSet:Set[List[Int]] = Set()
    (2 to 100).foreach(b => newSet ++= factorSet.map(repeatList(_, b)))
    println(newSet.size)
  }

  def repeatList(list:List[Int], b:Int): List[Int] = {
    var outputList:List[Int] = List()
    (1 to b).foreach(i => outputList ++= list)
    outputList.sortWith(_ < _)
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
