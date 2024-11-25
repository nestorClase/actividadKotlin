
fun abrir(funcion:String): ArrayList<Char> {
    var apertura:ArrayList<Char> = arrayListOf()
    var cnt:Int = 0
    for (simbolos in funcion){
        when(simbolos){
            '('-> apertura.add(simbolos)
            '[' -> apertura.add(simbolos)
            '{' -> apertura.add(simbolos)

        }
        cnt++
    }
    return apertura
}

fun cerrar(funcion:String): ArrayList<Char>{
    var cerrado:ArrayList<Char> = arrayListOf()
    var cnt:Int = 0
    for (simbolos in funcion){
        when(simbolos){
            ')'-> cerrado.add(simbolos)
            ']' -> cerrado.add(simbolos)
            '}' -> cerrado.add(simbolos)

        }
        cnt++
    }
    return cerrado
}

fun main(){
    print("Introduzca su funcion: ")
    var funcion = readln()
    val abierto:ArrayList<Char> = abrir(funcion)
    val cerrar:ArrayList<Char> = cerrar(funcion)

    var resultado:Boolean = false

    var posicion:Int = 0

    for (simboloA in abierto){
        for (simboloC in cerrar.reversed()){
            if(simboloA == simboloC){
                resultado = true
            }else{
                resultado = false
            }
            if(!resultado){
                break
            }
        }
    }
    println(resultado)
}