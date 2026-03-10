package it.unibo.pps.u02.es8

import it.unibo.pps.u02.es8.*
import it.unibo.pps.u02.es8.Expr.{Add, Literal, Multiply}
import org.junit.*
import org.junit.Assert.*

class Es8Test:

  val expr: Expr = Multiply(Add(Literal(1), Multiply(Literal(3), Literal(2))), Literal(6))

  @Test def testShow(): Unit = {
      assertEquals("((1 + (3 * 2)) * 6)", show(expr))
  }

  @Test def testEvaluate(): Unit = {
    assertEquals(42, evaluate(expr))
  }
