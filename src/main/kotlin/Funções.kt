fun main() {
    Impressao()
    var x = 10
    var y = 10
    Soma(x,y)
    println(Soma_2(x,y))
}

fun Impressao(){ // função sem parametro e sem retorno - VOID
    println("Função sem parametro e sem retorno")
}

fun Soma(a:Int,b:Int){ // função com parametro e sem retorno - VOID
    println("A soma das variáveis é: ${a+b}")
}

fun Soma_2(a:Int,b:Int):Int{ // função com parametro e com retorno do tipo inteiro
    return a+b
}
