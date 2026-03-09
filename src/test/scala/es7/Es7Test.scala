package es7

import it.unibo.pps.u02.es7.*
import org.junit.*
import org.junit.Assert.*

class Es7Test:
  @Test def testReverseNumber(): Unit = {
      assertEquals(54321, reverseNumber(12345))
      assertEquals(123, reverseNumber(321))
  }
