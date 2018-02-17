

object cosientesEnteros {
  def main(args: Array[String]): Unit = {
    divisiones(1, 32)
  }
  
   def divisiones(x:Int, y:Int):Unit={
    
    if(!(x==y)){
      if((y%x)==0){
        println("Divisores: "+y+": "+x)
        divisiones(x+1, y)
      }else{
        divisiones(x+1, y)
      }
    }else{
      println("Divisores: "+y+": "+x)
    }
  }
}