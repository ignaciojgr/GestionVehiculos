package gestionvehiculos;

public class VehiculoEstandar extends Vehiculo implements CostoAlquilerCalculable {

    public VehiculoEstandar() {
    }

    public VehiculoEstandar(String idVehiculo, String modelo, Double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
    }
        
    @Override
    public Double calcularCostoAlquiler(){
       return this.getCostoBaseAlquiler();
    }
}
