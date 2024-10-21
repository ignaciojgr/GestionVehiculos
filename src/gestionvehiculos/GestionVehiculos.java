package gestionvehiculos;

public class GestionVehiculos {

    public static void main(String[] args) {
        Sucursal macul = new Sucursal("101", "Rent-A-Car");
        VehiculoEstandar vestandar1 = new VehiculoEstandar("22", "CityCar", 200000.0);
        VehiculoDeLujo vdlujo1 = new VehiculoDeLujo("33", "Deportivo", 400000.0);
        macul.agregarVehiculo(vestandar1);
        macul.agregarVehiculo(vdlujo1);
        System.out.println(macul.calcularCostoAlquiler());
        
    }

}
