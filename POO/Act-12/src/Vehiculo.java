public class Vehiculo {
    private String fechaFabricacion;
    private String fechaEntrada;
    private int numeroBastidor;

    public Vehiculo(String fechaFabricacion, String fechaEntrada, int numeroBastidor) {
        this.fechaFabricacion = fechaFabricacion;
        this.fechaEntrada = fechaEntrada;
        this.numeroBastidor = numeroBastidor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(int numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fechaFabricacion='" + fechaFabricacion + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", numeroBastidor=" + numeroBastidor +
                '}';
    }
}
