import java.lang.Exception
import java.lang.NullPointerException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 0
    try{
        val res = (numerador/denominador)
        println("Resultado da divisão: $res")
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por zero!")
    }

    val numero = -4.0
    try{
        val res2 = sqrt(numero)
        if (numero < 0){
            throw IllegalArgumentException() //lansar
        }
        println("Resultado da radiciação: $res2")
    }catch (e: IllegalArgumentException){
        println("Erro: Não existe raiz real de números negativos!")
    }

}

fun tratamento(){
    try{
        var s:String? = null
        s= "Kowas"
        println("O tamanho da String é: ${s!!.length}")

        var c = 10/1
        println("O resultado da divisão será: $c")

        var a = 9.0
        val b = sqrt(a)
        if (a < 0){
            throw IllegalArgumentException() //lansar
        }

        var x = 2
        if (x==1){
            throw Exception("O valor de x não pode ser 1")
        }

    }catch (e: NullPointerException){
        println("A variávbel está vazia")
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por zero!")
    }catch (e: IllegalArgumentException){
        println("Erro: Não existe raiz real de números negativos!")
    }catch (e: IllegalArgumentException){
        println("Erro: Não existe raiz real de números negativos!")
    }finally { // Sempre executa ao final, mas é opicional
        println("Executando Finally, finalizando o bloco de tratamento de dados")
    }
    println("Final do programa")
}