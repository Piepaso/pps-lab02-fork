package it.unibo.pps.u02.es5

val compose: (Int => Int, Int => Int) => Int => Int = (f, g) => x => f(g(x))

//val compose: (T1 => T2 , T2 => T3) => T1 => T3 = (f, g) => x => f(g(x))