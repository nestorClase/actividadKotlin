fun main(){
    print("Introduzca la primera palabra : ")
    val palabra1: String = readln()
    print("Introduzca la segunda palabra : ")
    val palabra2:String = readln()

    var cnt:Int = 0

    var resultado:Boolean=false

    for(letra in palabra1){
        for (letra2 in palabra2){
            if (letra == letra2) {
                cnt++
                break
            }
        }
    }
    if(cnt==palabra1.length){
        println(true)
    }else{
        println(false)
    }

}