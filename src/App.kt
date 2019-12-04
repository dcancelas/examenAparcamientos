fun main() {
    val aparcamiento1 = Aparcamiento("Parking 1", 100, 50, Coche("343F34D", 17, 21) )
    println("Nombre: "+aparcamiento1.nombre)
    println("Plazas totales: "+aparcamiento1.ptotales)
    println("Plazas libres: "+aparcamiento1.plibres)
    println("Matrícula: "+aparcamiento1.coche.matricula)
    println("Hora de entrada: "+aparcamiento1.coche.horae)
    println("Hora de salida: "+aparcamiento1.coche.horas)
    //Al final con las prisas, sólo he conseguido incluir un sólo cohe dentro del aparcamiento.
}