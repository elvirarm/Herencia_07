class Automovil(marca: String, modelo: String, capacidadCombustible: Int, val tipo: String):Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }

    override fun mostrarInformacion() {
        println("Vehículo marca: $marca, modelo: $modelo, capacidad de combustible: $capacidadCombustible, tipo: $tipo, autonomía: ${calcularAutonomia()}")
    }


}