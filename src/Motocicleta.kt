class Motocicleta(nombre: String, marca: String, capacidadCombustible: Int, val cilindrada: Int): Vehiculo(nombre, marca, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }

    override fun mostrarInformacion() {
        println("Vehículo marca: $marca, modelo: $modelo, capacidad de combustible: $capacidadCombustible, cilindrada: $cilindrada, autonomía: ${calcularAutonomia()}")
    }
}