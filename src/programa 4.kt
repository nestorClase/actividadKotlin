
fun main(){
    print("Introduce las acciones del atleta: ")
    var acciones: String = readln()
    print("Introduce la pista: ")
    var pista:String = readln()

    acciones.toList()
    pista.toList()

    var puede:Boolean = false

    for(a in acciones){
        if(a.equals("correr") || a.equals("saltar")){
            acciones.re
        }
    }

    for(i in acciones.indices){
        if(acciones[i] == pista[i]){
            puede = true
        }else{
            puede = false
        }
    }
        println(puede)
    }