package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class Problem003Test extends FunSuite with ShouldMatchers {
  import Problem003._

  test("primes") {
    primes.take(8).toList should be (List(2, 3, 5, 7, 11, 13, 17, 19))
  }

  test("primeFactors") {
    primeFactors(13195) should be (List(5, 7, 13, 29))
  }

  test("largestPrimeFactor") {
    largestPrimeFactor(13195) should be (29)
  }
}
