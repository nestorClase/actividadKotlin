class Juego(val tablero: Array<Array<String?>>) {

    fun jugar(): String? {
        var cntX:Int = 0
        var cntO:Int = 0
        var resultado:String? = ""

        for (fila in tablero) {
            for (simbolo in fila) {
                if (simbolo.equals("X") || simbolo.equals("x")) {
                    cntX++
                } else if (simbolo.equals("O") || simbolo.equals("0") simbolo.equals("o")) {
                    cntO++
                }
            }
        }

        //Busque por chat gpt como moverme en diagonal por la matriz
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            resultado = tablero[0][0]
        }else if(tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]){
            resultado = tablero[0][2]
        }else if (tablero[0][0] == tablero[1][0] && tablero[1][0] == tablero[2][0]){
            resultado = tablero[0][0]
        }else if (tablero[0][1] == tablero[1][1] && tablero[1][1] == tablero[2][1]){
            resultado = tablero[0][1]
        }else if(tablero[0][2] == tablero[1][2] && tablero[1][2] == tablero[2][2]){
            resultado = tablero[0][2]
        }else if(tablero[0][0] == tablero[0][1] && tablero[0][1] == tablero[0][2]){
            resultado = tablero[0][0]
        }else if(tablero[1][0] == tablero[1][1] && tablero[1][1] == tablero[1][2]){
            resultado = tablero[1][0]
        }else if(tablero[2][0] == tablero[2][1] && tablero[2][1] == tablero[2][2]){
            resultado = tablero[2][0]
        }

        if(resultado == ""){
            resultado = "EMPATE"
        }
        if(cntO>cntX+1 || cntX>cntO+1){
            resultado = null
        }

        return resultado
    }

}
