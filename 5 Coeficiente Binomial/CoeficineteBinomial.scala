

object CoeficineteBinomial {
  def main(args: Array[String]) {

    print(combinations(4, 2))
  }

  def fac(n: Int): Int =
    (1 to n).foldLeft(1)(_ * _)

  def combinations(n: Int, k: Int): Int =
    fac(n) / (fac(k) * fac(n - k))

}