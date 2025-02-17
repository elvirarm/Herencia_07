open class Vehiculo (val marca: String, val modelo: String, val capacidadCombustible: Int){


    open fun mostrarInformacion(){
        println("Vehículo marca: $marca, modelo: $modelo, capacidad de combustible: $capacidadCombustible, autonomía: ${calcularAutonomia()}")
    }

    open fun calcularAutonomia(): Int{
        var autonomia = capacidadCombustible / 10
        return autonomia
    }
}