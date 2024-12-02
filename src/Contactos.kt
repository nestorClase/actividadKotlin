import kotlin.math.max

class Contactos (
    var nombre:String = "",
    var numero:Int = 0,
    var agenda:ArrayList<Contactos> = ArrayList<Contactos>(),
    var maximoAgenda : String = "") {

    fun incio(){
        println("¿Quieres añadir un maximo a tu agenda? ")
         maximoAgenda = readln()
        if(maximoAgenda.isEmpty()){
            maximoAgenda = "10"
            println("Se añadira un maximo de 10")
           agenda = ArrayList<Contactos>(maximoAgenda.toInt()) //Inicializa a null lo busque
        }else {
            agenda= ArrayList<Contactos>(maximoAgenda.toInt()) //Inicializa a null lo busque
        }
    }

    fun buscarpornombre(nombre:String):Boolean{
        var esta:Boolean=false
        for (agenda1 in agenda) {
            if (agenda1.nombre.equals(nombre)){
                esta = true
            }else{
                esta = false
            }
        }
        return esta
    }

    fun añadirContato() {
        println("Escriba el nombre")
        nombre = readln()
        println("Escriba el numero")
        numero = readln().toInt()

        for (contacto in agenda) {
            if(contacto.nombre.equals(nombre)){
                println("El contacto ya existe")
                return
            }
        }

        if (agenda.size >= maximoAgenda.toInt() ) {
            println("La agenda está llena")
            return
        }else {
            agenda.add(Contactos(nombre,numero))
            println("El contacto ha sido añadido")
        }
    }

    fun listarContatos() {
        if(agenda.isEmpty()){
            println("No hay contactos para mostrar")
            return
        }
        for(agenda1 in agenda){
            println("nombre = "+agenda1.nombre + "\n numero = "+agenda1.numero)
        }
    }

    fun buscarContacto(){
        println("¿Cual es el nombre del contato?")
        var nombrecontato = readln()

        for (agenda1 in agenda) {
            if (agenda1.nombre.equals(nombre)){
                println(" Su telefono es "+ agenda1.numero)
            }else{
                println("No se a encontrado el contacto")
            }
        }
    }

    fun existeContato(){
        println("¿Cual es el nombre del contato?")
        var nombrecontato = readln()

        if(buscarpornombre(nombrecontato)){
            println("El contrato existe")
        }else{
            println("El contacto no existe")
        }
    }

    fun eliminarContato(){
        println("¿Cual es el nombre del contato?")
        var nombrecontato = readln()

        for (agenda1 in agenda) {
            if (agenda1.nombre.equals(nombrecontato)){
                agenda.remove(agenda1)
                println("Se ha eliminado el contacto")
                return
            }else{
                println("No se ha eliminado el contacto")
            }
        }
    }

    fun huecosLibres() {
        var libre:Int = maximoAgenda.toInt() - agenda.size
        println("Hay $libre contacto/s libre/s")
    }

    fun agendaLlena(){
        var libre:Int = maximoAgenda.toInt() - agenda.size
        if(libre == 0){
            println("La agenda esta llena")
        }else{
            println("Aun se pueden agregar contactos")
        }
    }


}