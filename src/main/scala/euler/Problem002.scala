package euler

object Problem002 {

  def fibonacci(a: Int, b: Int): Stream[Int] = a #:: fibonacci(b, a + b)

  def fibonacci: Stream[Int] = fibonacci(1, 2)

  def solution(up: Int) = fibonacci.takeWhile(_ <= up).filter(_ % 2 == 0).sum
}
