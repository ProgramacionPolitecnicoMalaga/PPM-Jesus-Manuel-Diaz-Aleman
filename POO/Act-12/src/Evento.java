public class Evento {
    private String fecha;
    private Vehiculo vehiculo;

    public Evento(String fecha, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "fecha='" + fecha + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }

}
