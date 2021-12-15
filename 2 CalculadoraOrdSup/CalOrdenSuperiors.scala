

object CalcOrdenSuperior {
  def main(args: Array[String]) {

    println(operacion(10, 2, suma))
    println(operacion(10, 2, resta))
    println(operacion(10, 2, multi))
    println(operacion(10, 2, division))

  }
  def suma(x: Int, y: Int): Int = x + y
  def resta(x: Int, y: Int): Int = x - y
  def multi(x: Int, y: Int): Int = x * y
  def division(x: Int, y: Int): Int = x / y

  def operacion(x: Int, y: Int, fun: (Int, Int) => Int): Int = fun(x, y)

}