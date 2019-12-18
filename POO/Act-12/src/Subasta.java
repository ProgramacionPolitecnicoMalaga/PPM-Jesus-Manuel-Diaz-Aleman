public class Subasta extends Evento{
    public Subasta(String fecha, Vehiculo vehiculo) {
        super(fecha, vehiculo);
    }
    @Override
    public String toString() {
        return "Subasta{" +
                "fecha='" + getFecha() + '\'' +
                ", vehiculo=" + getVehiculo() +
                '}';
    }
}
