object prob24 {
  def main(args: Array[String]): Unit = {
    val perm:List[Int] = (0 to 9).permutations.slice(999999,1000000).toList.head.toList
    val x:String = perm.foldLeft("")(_ + _)
    println(x)
  }
}
