

object Divisores {
  def main(args: Array[String]): Unit = {
    println(mostrarDivisores(1, 32))
  }
  
  def mostrarDivisores(iteraciones:Int, numero:Int):Unit={
    
    if(!(iteraciones==numero)){
      if((numero%iteraciones)==0){
        println("divisor del "+numero+": "+iteraciones)
        mostrarDivisores(iteraciones+1, numero)
      }else{
        mostrarDivisores(iteraciones+1, numero)
      }
    }else{
      println("divisor del "+numero+": "+iteraciones)
    }
  }
}