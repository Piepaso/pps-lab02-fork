package it.unibo.pps.u02.es5

def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
