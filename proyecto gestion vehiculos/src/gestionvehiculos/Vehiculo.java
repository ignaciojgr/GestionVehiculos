package gestionvehiculos;

public abstract class Vehiculo {
    private String idVehiculo;
    private String modelo;
    private Double costoBaseAlquiler;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String modelo, Double costoBaseAlquiler) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCostoBaseAlquiler() {
        return costoBaseAlquiler;
    }

    public void setCostoBaseAlquiler(Double costoBaseAlquiler) {
        this.costoBaseAlquiler = costoBaseAlquiler;
    }
    
    public abstract Double calcularCostoAlquiler();
    
}
