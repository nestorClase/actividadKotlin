fun main(){
    var contato = Contactos()
    contato.incio()
    do {
        println("Que accion deseas realizar:" +
                "\n 1. Añadir contacto" +
                "\n 2. Listar contactos" +
                "\n 3. Buscar contacto" +
                "\n 4. Existe contacto" +
                "\n 5. Eliminar contacto" +
                "\n 6. Contactos disponibles" +
                "\n 7. Agenda llena" +
                "\n 8. Salir")
        var eleccion = readln().toInt()
        when(eleccion) {
            1 -> contato.añadirContato()
            2-> contato.listarContatos()
            3-> contato.buscarContacto()
            4-> contato.existeContato()
            5-> contato.eliminarContato()
            6->contato.huecosLibres()
            7->contato.agendaLlena()
            8->break
        }
    }while (true)
}