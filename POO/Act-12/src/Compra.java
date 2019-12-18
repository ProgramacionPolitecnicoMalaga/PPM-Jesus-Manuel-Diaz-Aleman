public class Compra extends Evento{
    private Comprador cliente;

    public Compra(String fecha, Vehiculo vehiculo, Comprador cliente) {
        super(fecha, vehiculo);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + getFecha() + '\'' +
                ", vehiculo=" + getVehiculo() +
                '}';
    }
}
