
fun main(){
    val accionesCorredor: Array<String> = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    var pista = "_|_|_"


    println(corriendo(accionesCorredor, pista))
}

fun corriendo(carrera: Array<String>, pista: String): String {
    var obstaculos: ArrayList<Char> = ArrayList()
    var paso = true
    var pistaFinal = pista

    if (carrera.size > pista.length) {
        val diferencia = carrera.size - pistaFinal.length
        pistaFinal = pista + "?".repeat(diferencia)
    }

    for (i in carrera.indices) {
        if (carrera[i] == "correr" && pistaFinal[i] == '_' || carrera[i] == "saltar" && pistaFinal[i] == '|') {
            obstaculos.add(pistaFinal[i])
        }else if (carrera[i] == "correr" && pistaFinal[i] == '|' || carrera[i] == "saltar" && pistaFinal[i] == '_') {
            obstaculos.add('/')
            paso = false
        }
        if(pistaFinal[i] == '?'){
            obstaculos.add('?')
            paso = false
        }
    }

    while(pista.length > carrera.size){
        obstaculos.add(pista[pista.length-1])
    }

    return "$obstaculos  $paso"
}