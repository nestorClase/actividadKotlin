fun main(){
    var tablero = Array(3){arrayOfNulls<String>(3)}

    tablero[0]= arrayOf("X", "O", "X")
    tablero[1]= arrayOf("X", "X", "O")
    tablero[2]= arrayOf("X", "X", "X")

    print(Juego(tablero).jugar())


}