package gestionvehiculos;
import java.util.ArrayList;
public class Sucursal {
    private String idSucursal;
    private String nombre;
    private ArrayList<Vehiculo> vehiculo = new ArrayList();

    public Sucursal() {
    }

    public Sucursal(String idSucursal, String nombre) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void agregarVehiculo (Vehiculo vehiculo){
        this.vehiculo.add(vehiculo);
    }
    
    public Double calcularCostoAlquiler(){
        for (Vehiculo iterador : this.vehiculo){
            Double costoSucursal = iterador.getCostoBaseAlquiler()*10000;
            return costoSucursal;
            
        }
        return null;
    }
}
