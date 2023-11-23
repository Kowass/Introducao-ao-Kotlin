fun main() {
    var str:String? =  null
    str = "Kowas"
    if(str != null){
        println("Caiu no if")
    }
    str?.let {
        println("Caiu no LET")
    }
}