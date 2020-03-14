import java.util.ArrayList;

public class Venta {
    Vehiculo vehiculo;
    Persona comprador;
    private int cantidad;

    public Venta(Persona comprador, Vehiculo vehiculo, int cantidad, ParqueVehiculos parqueVehiculos) {
        int i = parqueVehiculos.getListaVehiculos().indexOf(vehiculo);
        Vehiculo v = parqueVehiculos.getListaVehiculos().get(i);
        if(vehiculo.getUnidades()>= cantidad){
            this.vehiculo = vehiculo;
            this.comprador = comprador;
            this.cantidad = cantidad;
        }else{
            System.out.println("No se puede realizar la venta");
        }



    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return comprador;
    }

    public void setPersona(Persona comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Venta{" +
                ", vehiculo=" + vehiculo +
                ", persona=" + comprador +
                '}';
    }
}
