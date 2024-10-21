package gestionvehiculos;

public class VehiculoDeLujo extends Vehiculo implements CostoAlquilerCalculable {

    public VehiculoDeLujo() {
    }

    public VehiculoDeLujo(String idVehiculo, String modelo, Double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
    }
    
    @Override
    public Double calcularCostoAlquiler(){
        return this.getCostoBaseAlquiler()*2;
    }
}
