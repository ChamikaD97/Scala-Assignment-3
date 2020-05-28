/*
5.Can you write a recursive function to get the addition of all even numbers less than given n.
*/

object Q5 extends App{
  def isEven (n : Int ) : Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  
  def isOdd(n: Int) : Boolean = !(isEven(n))

  def addeven(n :Int ) : Int = n match {
    case 0 => 0
    case x if(isEven(x)) => n + addeven(x-1)
    case x if(isOdd(x)) => addeven(x-1)
  }
  
  println(addeven(5))
}