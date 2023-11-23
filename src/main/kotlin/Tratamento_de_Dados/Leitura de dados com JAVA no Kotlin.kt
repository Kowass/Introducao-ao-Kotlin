import java.util.Scanner

fun ler_int(){
    val scanner = Scanner(System. `in`)
    println("Digite um número inteiro")
    val num = scanner.nextInt()
    println("Voce digitou: ${num}")
}

fun ler_double(){ // utilizar virgula
    val scanner = Scanner(System. `in`)
    println("Digite um número inteiro")
    val num = scanner.nextDouble()
    println("Voce digitou: ${num}")
}

fun ler_float(){ // utilizar virgula
    val scanner = Scanner(System. `in`)
    println("Digite um número float")
    val num = scanner.nextFloat()
    println("Voce digitou: ${num}")
}

fun ler_string(){
    val scanner = Scanner(System. `in`)
    println("Digite um nome")
    val num = scanner.next()
    println("Voce digitou: ${num}")
}

fun ler_bool(){
    val scanner = Scanner(System. `in`)
    println("Digite um booleano")
    val num = scanner.nextBoolean()
    println("Voce digitou: ${num}")
    scanner.close()
}

fun main() {
    ler_int()
    ler_double()
    ler_float()
    ler_string()
    ler_bool()
}