package Es4

import it.unibo.pps.u02.es4.*
import org.junit.*
import org.junit.Assert.*

class Es4Test:
  @Test def testP1(): Unit =
    assertTrue(p1(3)(4)(4))
    assertFalse(p1(5)(3)(5))

  @Test def testP2(): Unit =
    assertTrue(p2(3,4,4))
    assertFalse(p2(5, 3, 5))

  @Test def testP3(): Unit =
    assertTrue(p3(3)(4)(4))
    assertFalse(p3(5)(3)(5))

  @Test def testP4(): Unit =
    assertTrue(p4(3,4,4))
    assertFalse(p4(5, 3, 5))
