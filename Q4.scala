/*
4. Can you write a recursive function to determine even and odd numbers? 
*/


object Q4 extends App{

  def isEven (n : Int ) : Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)

  }

  def isOdd(n: Int) : Boolean = !(isEven(n))

  println("12 is even :"+isEven(12))
  println("15 is even :"+isEven(15))
  println("18 is even :"+isEven(18))
  println("11 is even :"+isEven(11))
}