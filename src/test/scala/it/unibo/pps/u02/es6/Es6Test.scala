package it.unibo.pps.u02.es6

import it.unibo.pps.u02.es6.*
import org.junit.*
import org.junit.Assert.*

class Es6Test:

  def testPower(power: (Int, Int) => Int): Unit = {
    assertEquals(32, power(2, 5))
    assertEquals(25, power(5, 2))
    assertEquals(1, power(5, 0))
  }

  @Test def testSimplePower() : Unit = testPower(power)

  @Test def testTailrecPower(): Unit = testPower(tailPower)
