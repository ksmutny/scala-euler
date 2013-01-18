package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class Problem001Test extends FunSuite with ShouldMatchers {
  import Problem001._

  test("multiplesOf(3)") {
    multiplesOf(3)(10) should be (Set(3, 6, 9))
  }

  test("multiplesOf(5)") {
    multiplesOf(5)(10) should be (Set(5, 10))
  }

  test("naiveSolution(20)") {
    // number 15 is added once
    naiveSolution(20) should be (3 + 5 + 6 + 9 + 10 + 12 + 15 + 18 + 20)
  }

  test("MultiplesOf.sum") {
    MultiplesOf(3).sum(10) should be (3 + 6 + 9)
  }

  test("naiveSolution == gaussSolution") {
    naiveSolution(1000) should be (gaussSolution(1000))
  }
}
