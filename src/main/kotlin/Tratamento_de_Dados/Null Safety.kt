fun main() {
    var str: String? = null // ? -> digo que vou alocar valor nela posteriormente
    println(str?.length) // Kotlin identifica e assume o tratamento do erro
    str = "Kowas cria"
    println(str!!.length) // Eu assum o erro(preciso fazer o tratamento)
    println("Testando")
}