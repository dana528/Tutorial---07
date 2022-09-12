
object question01  extends App {

  val obj1 = new Rational(1,2)
  
  val obj2 = new Rational(4,5)
  
  println(obj1.neg)
  val ans = obj1.add(obj2)
  println(ans)
}

class Rational(a:Int, b:Int) {
 //   require(denom > 0, "Denominator must be greater than 0")
   
    def numer = a
    def denom = b

    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    
    def neg = new Rational(-this.numer, this.denom)
    
    override def toString(): String = numer + "/" + denom
}
