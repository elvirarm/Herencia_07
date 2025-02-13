
fun main() {


    val motocicleta = Motocicleta("moto", "marca", 50, 90)

    motocicleta.calcularAutonomia()
    motocicleta.mostrarInformacion()


    val vehiculo = Vehiculo("vehiculo", "marca", 50)

    vehiculo.calcularAutonomia()
    vehiculo.mostrarInformacion()


    val automovil = Automovil("automovil", "marca", 50, "tipo")

    automovil.calcularAutonomia()
    automovil.mostrarInformacion()


}