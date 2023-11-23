fun main() {
    //Any, Unit, Nothing
    a(10)
    a(10.5)
    a(false)
    a("Kowas")
    b()
    c() //Mostra um erro. A função pode ser para criar a função, mas n codar ela e informar isso
}

fun a(valor: Any){ // Aceita qualquer valor, sem precisar expecificar
    println("Imprimindo o valor: $valor")
}

fun b():Unit{ // mesma coisa que não colocar unit == "fun b(){}"
    println("Função sem retorno (Void)")
}

fun c():Nothing{
    TODO("Função ainda a ser completada")
}