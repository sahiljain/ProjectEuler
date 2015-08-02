object prob92 {
  def main(args: Array[String]): Unit = {
    val memo:Array[Int] = new Array[Int](100000000)
    // let 0 be undefined, 1 means converges to 1, 2 means converges to 89
    memo(1) = 1
    memo(89) = 2
    (2 to 10000000).foreach(i => memo(i) = getConvergence(i, memo))
    println(memo.count(_ == 2)) //print how many converge to 89
  }

  def getConvergence(x: Int, memo: Array[Int]): Int = {
    if (memo(x) == 0) {
      val nextIndex:Int = (""+x).map(i => (i-48)*(i-48)).sum
      memo(x) = getConvergence(nextIndex, memo)
    }
    memo(x)
  }
}
