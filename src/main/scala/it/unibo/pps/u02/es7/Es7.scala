package it.unibo.pps.u02.es7

import scala.annotation.tailrec

def reverseNumber(n: Int): Int =
  @tailrec
  def r(n: Int, acc: Int): Int = (n, acc) match
    case (n, acc) if n == 0 => acc
    case (n, acc) => r(n/10, acc*10 + n%10)

  r(n, 0)

