object prob97 {
  def main(args: Array[String]):Unit = {
    //first calculate last 10 digits of 2^7830457
    var power:Long = 1
    for (i <- 1 to 7830457) {
      power = power*2 % 10000000000L
    }
    println((power*28433 + 1) % 10000000000L)
  }
}
