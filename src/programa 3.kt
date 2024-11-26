
fun abrir(funcion:String): ArrayList<Char> {
    var apertura:ArrayList<Char> = arrayListOf()
    for (simbolos in funcion){
        if(simbolos == '(' || simbolos == '{' || simbolos == '['){
            apertura.add(simbolos)
        }
    }
    return apertura
}

fun cerrar(funcion:String): ArrayList<Char>{
    var cerrado:ArrayList<Char> = arrayListOf()
    for (simbolos in funcion){
        if(simbolos == ')' || simbolos == '}' || simbolos == ']'){
            cerrado.add(simbolos)
        }
    }
    return cerrado
}

fun main(){
    print("Introduzca su funcion: ")
    var funcion = readln()
    var abierto:ArrayList<Char> = abrir(funcion)
    var cerrar:ArrayList<Char> = cerrar(funcion)

    var resultado:Boolean = false
    if(abierto.size!=cerrar.size){
        resultado = false
    }else {

        for (simboloA in abierto) {
            for (simboloC in cerrar.reversed()) {
                if (simboloA == '(' && simboloC == ')') {
                    resultado = true
                    break
                } else if (simboloA == '[' && simboloC == ']') {
                    resultado = true
                    break
                } else if (simboloA == '{' && simboloC == '}') {
                    resultado = true
                    break
                } else {
                    resultado = false
                }
            }
            if (!resultado) {
                break
            }
        }
    }
        println(resultado)
    }

