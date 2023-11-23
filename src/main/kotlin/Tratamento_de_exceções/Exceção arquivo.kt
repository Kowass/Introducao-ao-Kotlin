import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
    ler_arquivo()
}

fun ler_arquivo(){
    val arquivo = File("C:\\Users\\felip\\Desktop\\Conceitos_iniciais\\src\\main\\kotlin\\Tratamento_de_exceções\\Arq.txt")
    try {
        Scanner(arquivo).use { l ->
            while (l.hasNext()) {
                println(l.next())
            }
            l.close() // fechar o arquivo
        }

    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")
        // e.printStackTrace;
    }

}