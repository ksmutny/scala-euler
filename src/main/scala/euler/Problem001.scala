package euler

object Problem001 {

  /*
   * Naive solution using Seq.filter with O(n)
   */

  def multiplesOf(n: Int)(up: Int): Set[Int] = {
    val multiples = 1 to up filter (_ % n == 0)
    multiples.toSet
  }

  def naiveSolution(up: Int): Int = (multiplesOf(3)(up) ++ multiplesOf(5)(up)).sum

  /*
   * Gauss formula-based naiveSolution with O(1)
   */

  case class MultiplesOf(n: Int) {
    def sum(up: Int) = {
      val c = up / n
      n * c * (1 + c) / 2
    }
  }

  def gaussSolution(up: Int) = MultiplesOf(3).sum(up) + MultiplesOf(5).sum(up) - MultiplesOf(15).sum(up)
}
