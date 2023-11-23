class Pessoa(val ano_nasc:Int, var nome:String){
    var idade = 2023 - ano_nasc
    fun saudacao(){
        println("Seja bem vinde ${this.nome}")
    }
    fun estado(x: Boolean = true){
        if(x == true){
            println("${this.nome} está acorado!")
        }else{
            println("${this.nome} está dormindo!")
        }
    }
}

fun main() {
    println("Digite seu ano de nascimento:")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite seu nome completo:")
    var y = readln()
    println("Voce está acordado?")
    var c = readlnOrNull()?.toBoolean() ?: false
    var pessoa: Pessoa = Pessoa(x,y)
    println(pessoa.ano_nasc)
    println(pessoa.nome)
    println("Voce tem ${pessoa.idade} anos")
    pessoa.saudacao()
    pessoa.estado(c)
}