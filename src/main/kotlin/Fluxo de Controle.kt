fun main() {
estruturas_de_repetição_FOR()
}

fun estrutura_de_decisão_IF(){
    var idade:Int = 19
    if(idade<60 && idade>=21){
        println("Adulto")
    }else if(idade<21){
        println("Jovem")
    }else{
        println("Idoso")
    }
}

fun estrutura_de_decisão_When(){
    var cargo:String = "Gerente"
    when(cargo){
        "Presidente" -> println(6000f)
        "Gerente" -> println(45000f)
        "Coordenador" -> println(3000f)
        "Analista" -> println(2400f)
        "Estagiágiario" -> println(1600f)
        else ->  println("Cargo não identificado")
    }
}

fun estruturas_de_repetição_FOR(){
    for(i in 1 .. 20){ // Crescente
        println("${i} ")
    }

    println("\n")
    for(i in 20 downTo 1){ // Decrescente
        println("${i} ")
    }

    println("\n")
    var str = "Felipe"
    for(i in 0 .. (str.length-1)){
        if(str[i]=='e'){
            continue
        }
        println("${str[i]} ")
    }

    println("\n")
    for(i in 1 .. 20 step 2){ // Pulando de 2 em 2
        println("${i} ")
    }

    println("\n")
    for(i in 20 downTo  1 step 3){ // Pulando de 3 em 3
        println("${i} ")
    }
}

fun estruturas_de_repetição_While(){
    var i:Int = 0
    while(i<100){
        println("${i} ")
        if(i==20){
            break
        }
        i++
    }
}

fun estruturas_de_repetição_DoWhile(){
    var i:Int = 0
    do{
        println("${i} ")
        i++
    }while(i!=10)
}