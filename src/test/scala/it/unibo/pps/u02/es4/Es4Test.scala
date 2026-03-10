package it.unibo.pps.u02.es4

import it.unibo.pps.u02.es4.*
import org.junit.*
import org.junit.Assert.*

class Es4Test:

  def testCurried(p: Int => Int => Int => Boolean): Unit =
    assertTrue(p(3)(4)(4))
    assertFalse(p(5)(3)(5))

  def testNotCurried(p: (Int, Int, Int) => Boolean): Unit =
    assertTrue(p(3, 4, 4))
    assertFalse(p(5, 3, 5))

  @Test def testP1(): Unit =
    testCurried(p1)

  @Test def testP2(): Unit =
    testNotCurried(p2)

  @Test def testP3(): Unit =
    testCurried(p3)

  @Test def testP4(): Unit =
    testNotCurried(p4)
