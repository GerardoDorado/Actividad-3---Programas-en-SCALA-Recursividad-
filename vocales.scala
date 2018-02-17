

object vocales {
  def main(args: Array[String]): Unit = {
    println("Cantidad de vocales: " + contadorVocales("Programacion funcional", 0, 0))
  }
  
  def contadorVocales(cadena:String, i:Int, cont:Int):Int={    
    if(i==cadena.length()){
      return cont
    }else{
      if(cadena.charAt(i).equals('a')||cadena.charAt(i).equals('u')||
          cadena.charAt(i).equals('i')||cadena.charAt(i).equals('o')||
          cadena.charAt(i).equals('u')){
        contadorVocales(cadena, i+1, cont+1)
      }else{
        contadorVocales(cadena, i+1, cont)
      }
      
    }
  }
  
}