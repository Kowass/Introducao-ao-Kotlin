fun main() {
    Matriz()
}

fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5)
    for(i in 0 .. (numeros.size-1)){
        println("${numeros[i]} ")
    }
}

fun vetor_inteiros_2(){
    var n = Array(10,{i->i})
    for(i in n){
        println("${n[i]} ")
    }
}

fun vetor_bool(){
    var b = booleanArrayOf(true, false, true, false, false)
    for(i in 0 .. (b.size-1)){
        println("${b[i]} ")
    }
}

fun vetor_str(){
    var a = arrayOf("Fortaleza", "Quixeramobim")
}

fun Matriz(){
    val linhas = 3
    val colunas = 5
    val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }
    var digito = -1
    for(i in 0 until linhas){
        for(j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }

    for(i in 0 until linhas){
        for(j in 0 until colunas){
            matriz[i][j] = ++digito // primeiro incrementa e depois atribui valor (digito++ primeiro atribui valor e depois incrementa)
        }
    }
    println()

    for(linha in matriz){
        for(valor in linha){
            print("${valor} ")
        }
        println()
    }

    println("Quantidade de linhas da matriz: ${matriz.size}")
    println("Quantidade de colunas da matriz: ${matriz[0].size}")
}