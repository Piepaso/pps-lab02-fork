package it.unibo.pps.u02.es4

val p1: Int => Int => Int => Boolean = x => y => z => y == z && y > x

val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z

def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y == z
/*

x ≤ y = z

val p1: CurriedFunType = ???
val p2: NonCurriedFunType = ...
def p3(...)(...)(...): ... = ...
def p4(...): ... = ...

 */