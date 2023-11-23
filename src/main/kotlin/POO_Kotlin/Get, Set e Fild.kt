// Função SET - Atribui um valor ao campo correspondente.
// Função GET - Retorna o valor do campo correspondentes.
// Função Field - Evita chamadas infinitas.

class Planeta(var nome:String){
    private var id = 1
    var tamanho = 1000
    var fala = "Terra" // O GET e SET são apenas para a variável fala

        get() {
            println("Acessando GET")
            return field
        }

        set(value) {
            println("Acessando SET")
            field = value
        }
}

class Planeta2{
    var nome: String = ""
        get() {
            println("Meu nome é $field")
            return field
        }
        set(value) {
            if(value == ""){
                println("Todo planeta possui um nome")
            }else{
                field = value
            }
        }
}

fun main() {
    var p: Planeta = Planeta("Terra")
    println("Imprimindo o tamanho ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.tamanho
    a.fala = "Novo Planeta Marte"
    a.fala

    println("----------")
    var p2: Planeta2 = Planeta2()
    p2.nome = ""
    println(p2.nome)

    println("----------")
    p2.nome = "Jupiter"
    println(p2.nome)
}