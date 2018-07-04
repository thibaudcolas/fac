package one

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sqrt(x: Double): Double = {
    def abs(x: Double): Double = if (x < 0) -x else x

    def isGoodEnough(guess: Double): Boolean = abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double = (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  sqrt(4)                                         //> res0: Double = 2.000609756097561
  sqrt(1e-6)                                      //> res1: Double = 0.0010000001533016628
  sqrt(1e60)                                      //> res2: Double = 1.0000788456669446E30
}