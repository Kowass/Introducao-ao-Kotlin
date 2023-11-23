class robo{
    lateinit var nome: String
    fun ligar(){
        nome = "Iniciando o robo..."
    }
    fun inicio_tardio(){
        if(!this::nome.isInitialized){
            nome = "Inicializando tardiamente..."
            println(nome)
        }
    }
}

fun main() {
    var bot:robo = robo()
    println(bot.ligar())
}