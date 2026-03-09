package it.unibo.pps.u02.es6

import scala.annotation.tailrec

def power(base: Int, exp: Int): Int = (base, exp) match
  case (_, exp) if exp == 0 => 1
  case (base, exp) => base * power(base, exp - 1)


def tailPower(base: Int, exp: Int): Int =
  @tailrec
  def pow(base: Int, exp: Int, acc: Int): Int = (base, exp, acc) match
    case (_, exp, acc) if exp == 0 => acc
    case (base, exp, acc) => pow(base, exp - 1, acc*base)
  
  pow(base, exp, 1)