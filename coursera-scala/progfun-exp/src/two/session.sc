package two

import math.abs

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be ne 0")
  
  def this(x: Int) = this(x, 1)
  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  
  def numer = x / g
  def denom = y / g
  
  def + (that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  
  def unary_- : Rational = new Rational(-numer, denom)
  
  def - (that: Rational) = this + -that
  
  def < (that: Rational) = numer * that.denom < that.numer * denom
  
  def max(that: Rational) = if (this < that) that else this
    
  override def toString = numer + "/" + denom
}

object session {
  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x:Double, y:Double) =
    abs((x - y) / x) / x < tolerance              //> isCloseEnough: (x: Double, y: Double)Boolean
  
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  
  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
  // sqrt(2)
  
  val test = new Rational(1, 2)                   //> test  : two.Rational = 1/2
  val test2 = test + new Rational(3, 5)           //> test2  : two.Rational = 11/10
  
  val x = new Rational(1, 3)                      //> x  : two.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : two.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : two.Rational = 3/2
  
  x - y - z                                       //> res0: two.Rational = -79/42
  y + y                                           //> res1: two.Rational = 10/7
  x < y                                           //> res2: Boolean = true
}