class objt{
    fun amanhacer(h:Int){
        if(h<=4 && h>=0){
            println("Está de madrugada")
        }else{
            println("Está de dia")
        }
    }
    fun acordar(n:Int){
        if(n==0){
            println("Está dormindo")
        }else{
            println("Está acordado")
        }
    }
}

fun main() {
    var obj:objt = objt()
    obj.amanhacer(1)
    obj.acordar(0)

    println("----------------------------------")

    with(obj){      // Facilitar a chamada das funções dos objetos
        amanhacer(1)
        acordar(0)
    }
}