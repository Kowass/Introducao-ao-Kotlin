fun main() {
    var ret: Retangulo = Retangulo(10, 20)
    var ret2: Retangulo = Retangulo(10, 20)

    // Funções básicas e padrões de todos os obejtos: Equals, toString, hashCode

    println(ret.equals(ret2)) // false -> não possuem o mesmo endereço, são objetos diferentes. Porém com o mesmo valor

    var ret3: RetanguloData = RetanguloData(10, 20)
    var ret4: RetanguloData = RetanguloData(10, 20)
    println(ret3.equals(ret4))

    var ret5: RetanguloData = RetanguloData(-3,17)
    ret5 = ret4.copy()
    println(ret5.toString())
}

class Retangulo(var a:Int, var b:Int){ //DataClass substitui todas essas override;
    /*
    override fun equals(other: Any?): Boolean {
        return if(other is Retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
    */
}

data class RetanguloData(var a:Int, var b:Int){}

data class Informacoes(val rua:String, val nu:Int, val Bairro:String, val CEP:Int, val cidade:String){}

fun endereco(e:Informacoes){

}