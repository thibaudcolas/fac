package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("singletonSet(1) ! contains 3") {
    new TestSets {
      assert(!contains(s1, 3), "Singleton")
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("union !contains other elements") {
    new TestSets {
      val s = union(s1, s2)
      assert(!contains(s, 11), "Union 11")
      assert(!contains(s, 33), "Union 33")
    }
  }

  test("union of union contains all elements") {
    new TestSets {
      val h = union(s1, s2)
      val s = union(h, s3)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(contains(s, 3), "Union 3")
    }
  }

  test("intersect contains all elements") {
    new TestSets {
      val h = union(s1, s2)
      val s = union(h, s3)
      val b = intersect(s, s1)
      val c = intersect(s, s2)
      val d = intersect(s, s3)
      assert(contains(b, 1), "Intersect 1")
      assert(contains(c, 2), "Intersect 2")
      assert(contains(d, 3), "Intersect 3")
      assert(!contains(b, 3), "Intersect 3")
      assert(!contains(c, 1), "Intersect 1")
      assert(!contains(d, 4), "Intersect 4")
    }
  }
  
  test("filter p > 1") {
    new TestSets {
      val h = union(s1, s2)
      val filtered = filter(h, x => x > 1)
      assert(!contains(filtered, 1), "Filter 1")
      assert(contains(filtered, 2), "Filter 2")
    }
  }

  test("forall set > / >= -1000") {
    val h = (x: Int) => x >= -1000
    val p = (x: Int) => x > 1000
    assert(forall(h, h), "Forall >= -1000")
    assert(!forall(h, p), "Forall > -1000")
  }
  
  test("forall square") {
    val s = (x: Int) => x == 3 || x == 5 || x == 100
    val p = (x: Int) => x * x <= 100000
    
    assert(forall(s, p), "Forall square")
    
    val pp = (x: Int) => x * x < 50
    assert(!forall(s, pp), "Forall square fail")
  }
  
  test("exists 5") {
    val s = (x: Int) => x == 3 || x == 5 || x == 100
    
    assert(exists(s, (x: Int) => x == 5), "exists 5")
    assert(!exists(s, (x: Int) => x == 50), "!exists 50")
  }
  
  test("map 1") {
    val s = (x: Int) => x == 1 || x == 2 || x == 3
    assert(map(s, (x: Int) => x * 2)(2), "map 1 = 2")
    assert(map(s, (x: Int) => x * 2)(4), "map 2 = 4")
    assert(map(s, (x: Int) => x * 2)(6), "map 3 = 6")
    assert(!map(s, (x: Int) => x * 2)(8), "map 4 != 8")
  }
}
