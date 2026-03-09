package Es5

import it.unibo.pps.u02.es5.*
import org.junit.*
import org.junit.Assert.*

class Es5Test:
  @Test def testCompose(): Unit = {
      assertEquals(9, compose(_ - 1, _ * 2)(5))
  }
