fun main() {
    println("----Variáveis----")
}

fun tipos_de_variaveis() {
    var x: Int = 19 // Variável mutável (valor pode ser mudado)
    val y: Int // Variável imutável (valor constante, não pode ser mudado)
    var f: Float = 103.32f
    var d: Double = 3.14342
    var l: Long = 1010100120101
    var c: Char = 'F'
    var s: String = "Felipe"
    var sh: Short = 100 // Números pequenos
    var b: Byte = 0b1010
    var by: Byte = 0xf
    var u: UInt = 12u // Unsigned
    var bool: Boolean //true or false
}

fun tamanho_variavel() {
    println("Ulong máximo: ${ULong.MAX_VALUE} ulong mínimo: ${ULong.MIN_VALUE}")
    println("UInt máximo: ${UInt.MAX_VALUE} uInt mínimo: ${UInt.MIN_VALUE}")
    println("UShort máximo: ${UShort.MAX_VALUE} uInt mínimo: ${UShort.MIN_VALUE}")
}

fun operadores() {
/* OPERADORES LÓGICOS
    && -> E
    || -> Ou
    ! -> Negação
*
* */
}