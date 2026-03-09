package it.unibo.pps.u02.es3

// a)

def positive(n: Int): String = n match
  case n if n < 0 => "negative"
  case _ => "positive"


// b)

def neg(f: String => Boolean)(input: String) = !f(input)

