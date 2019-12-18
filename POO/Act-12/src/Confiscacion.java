public class Confiscacion extends Evento{
    public Confiscacion(String fecha, Vehiculo vehiculo) {
        super(fecha, vehiculo);
    }

    @Override
    public String toString() {
        return "Confiscacion{" +
                "fecha='" + getFecha() + '\'' +
                ", vehiculo=" + getVehiculo() +
                '}';
    }
}
