/*
1. Can you write a recursive function prime(n) that returns true for a prime number and false for the other? 
For example prime(5) should return true and prime(8) should return false.
*/



object Q1 extends App{

  def GCD(num1 : Int,num2 :Int ):Int = num2 match{
    case 0 => num1
    case a if a > num1 => GCD(a,num1)
    case _ => GCD(num2,num1 % num2)
  }

  def prime(num : Int , div : Int = 2): Boolean = div match{
    case a if(num ==  div) => true
    case a if GCD(num,div) > 1 => false
    case _ => prime(num,div+1)
  }

  println("13 is a prime :"+prime(5))
  println("9 is a prime :" +prime(8))
  println("5 is a prime :"+prime(13))
  println("10 is a prime :"+prime(15))
}