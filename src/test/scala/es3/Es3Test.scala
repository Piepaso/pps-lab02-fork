package es3

import it.unibo.pps.u02.es3.*
import org.junit.*
import org.junit.Assert.*

class Es3Test:
  @Test def testPositive(): Unit =
    assertEquals("positive", positive(0))
    assertEquals("negative", positive(-5))

  @Test def testNeg(): Unit =
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = neg(empty) // which type of notEmpty?
    notEmpty("foo") // true
    notEmpty("") // false
    notEmpty("foo") && !notEmpty("") // true.. a comprehensive test


/** Task 5: do test for map **/