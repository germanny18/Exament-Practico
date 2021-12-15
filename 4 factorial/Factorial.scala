

object Factorial {

  def fac(n: Int): Int =
    (1 to n).foldLeft(1)(_ * _)
    
  def main(args: Array[String]) {
    print(fac(5))

  }

}