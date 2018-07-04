package recfun
import common._

object Main {
  // val spaces = Array("         ", "        ", "       ", "      ", "     ", "    ", "   ", "  ", " ", "", "")
    
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      // print(spaces(row))
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = c match {
    case _ if c < 0 => 0
    case _ if c > r => 0
    case 0 => 1
    case _ if c == r => 1
    case _ => pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    // A l-paren increments, a r-paren decrements.
    def countParen(c : Char) : Int = c match {
      case '(' => 1
      case ')' => -1
      case _ => 0
    }
    
    // Below 0, not balanced (r b4 l). Above, maybe.
    def balanceCount(chars: List[Char], acc: Int): Int = acc match {
      case _ if acc < 0 => acc
      case _ if acc >= 0 => chars match {
        case Nil => 0
        case h::Nil => acc + countParen(h)
        case h::t => balanceCount(t, acc + countParen(h))
      }
    }
    
    balanceCount(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeCount(money: Int, coins: List[Int], acc: Int): Int = money match {
      case 0 => acc + 1
      case _ if money < 0 || coins.isEmpty => acc
      case _ => countChangeCount(money - coins.head, coins, acc) + countChangeCount(money, coins.tail, acc)
    }
    
    countChangeCount(money, coins, 0)
  }
}
