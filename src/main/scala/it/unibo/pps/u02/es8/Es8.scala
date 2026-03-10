package it.unibo.pps.u02.es8

import it.unibo.pps.u02.es8.Expr.{Add, Literal, Multiply}

enum Expr:
  case Literal(value: Int)
  case Add(left: Expr, right: Expr)
  case Multiply(left: Expr, right: Expr)

def show(e: Expr): String = e match
  case Literal(v) => "" + v + ""
  case Add(l, r) => "(" + show(l) + " + " + show(r) + ")"
  case Multiply(l, r) => "(" + show(l) + " * " + show(r) + ")"

def evaluate(e: Expr): Int = e match
  case Literal(v) => v
  case Add(l, r) => evaluate(l) + evaluate(r)
  case Multiply(l, r) => evaluate(l) * evaluate(r)