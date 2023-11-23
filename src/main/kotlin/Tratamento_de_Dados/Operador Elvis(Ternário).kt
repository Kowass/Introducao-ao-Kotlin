fun main() {
    var str:String? = null
    str = "Kowas"
    if(str == null){
        println("Nulo")
    }else{
        println(str)
    }
    // Operador Elvis
    println(str ?: "nula") // Operador Elvis - lembra o operador ternário
}