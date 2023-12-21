package POO_Kotlin

class Matematica(){
    companion object M{
        val PI = 3.14152
        val KK = 3
        fun adc(){}
    }
    init {
        println("Iniciando Companion")
    }
    object objt01{
        val euler = 0.03
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando Obj 01")
        }
    }
    object objt02{
        val dourado = 1.61
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando Obj 02")
        }
    }
    object objt03{
        val t = 8
        val PI = 3.1415
        fun adc(){}
        init {
            println("Iniciando Obj 03")
        }
    }
}

fun main() {
   var x: Matematica = Matematica()
    println("Acessando obj 01 ${Matematica.objt01.euler}")
    println("Acessando obj 01 ${Matematica.objt01.euler}")
    println(Matematica.PI)
}