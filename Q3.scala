/*
3.Can you write a recursive function returns the addition of numbers from1 to n?
For example sum(5) should print 15
*/


object Q3 extends App{

  def add(n :Int ) : Int = n match {
    case 0 => 0
    case _ => n + add(n-1)
  }
  print(add(5))

}

