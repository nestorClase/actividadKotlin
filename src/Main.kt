fun main(){
    var tablero = Array(3){arrayOfNulls<String>(3)}

    tablero[0]= arrayOf("O", "O", "O")
    tablero[1]= arrayOf("O", "X", "X")
    tablero[2]= arrayOf("O", "X", "X")

    print(Juego(tablero).jugar())


}