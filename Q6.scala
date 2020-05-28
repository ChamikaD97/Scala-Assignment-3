/*
6. The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . . 
Each subsequent number is the sum of the previous two. 
Write a recursive function print fist n Fibonacci numbers for given n.
*/

object question6 extends App{

  def fibbo(n : Int) : Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibbo(n-1)+fibbo(n-2)
  }

  def Fibonacci (n : Int,i : Int = 0) : Unit = {
    print(fibbo(i)+" ")
    if (n-1 > i) Fibonacci (n,i+1)
  }

  Fibonacci (10)
}