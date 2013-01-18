package euler

import collection.immutable.Queue

object Problem003 {

  def eratosthenes(start: Long, pastPrimes: Queue[Long]): Stream[Long] =
    start #:: eratosthenes(start + 1, pastPrimes :+ start).dropWhile(n => pastPrimes exists (n % _ == 0))

  def primes: Stream[Long] = eratosthenes(2, Queue())

  def primeFactors(n: Long) = {
    def primeFactors(n: Long, primes: Stream[Long]): List[Long] =
      if (n == 1) Nil
      else if (n % primes.head == 0) primes.head :: primeFactors(n / primes.head, primes)
      else primeFactors(n, primes.tail)

    primeFactors(n, primes)
  }

  def largestPrimeFactor(n: Long) = primeFactors(n).max
}
