

object sumatoria {
  def main(args: Array[String]): Unit = {
    println("Sumatoria: " + sumatoriaSuma(1, 5, 0) )
  }
  
  def sumatoriaSuma(limiteInferior:Int, limiteSuperior:Int, suma:Int):Int={
    var sum=suma
    
    if(limiteInferior==limiteSuperior){
      return sum+limiteInferior      
    }else{
      sum+=limiteInferior
      sumatoriaSuma(limiteInferior+1, limiteSuperior, sum)
    }
  }
}