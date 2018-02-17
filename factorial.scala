

object factorial {
  def main(args: Array[String]): Unit = {
    println("Factorial: "+factorialSuma(7, 0))
  }
  
  def factorialSuma(numero:Int, sumaM:Int):Int={
    if(numero>0){
      if(sumaM==0){
        factorialSuma(numero-1, numero)
      }else{
        factorialSuma(numero-1, sumaM*numero)
      }
    }else{
      return sumaM
    }
  }
}