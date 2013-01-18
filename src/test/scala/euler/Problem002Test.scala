package euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class Problem002Test extends FunSuite with ShouldMatchers {
  import Problem002._

  test("fibonacci") {
    fibonacci.take(11).toList should be (List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144))
  }

  test("solution(150)") {
    solution(150) should be (2 + 8 + 34 + 144)
  }
}
