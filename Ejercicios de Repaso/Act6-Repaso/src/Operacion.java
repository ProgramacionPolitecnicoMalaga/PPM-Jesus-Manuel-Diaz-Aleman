import java.util.ArrayList;

public class Operacion {
    private int precioAcordado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Operacion(int precioAcordado, Cliente cliente, Vehiculo vehiculo) {
        this.precioAcordado = precioAcordado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public int getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(int precioAcordado) {
        this.precioAcordado = precioAcordado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "precioAcordado=" + precioAcordado +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}

