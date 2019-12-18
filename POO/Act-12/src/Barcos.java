public class Barcos extends Vehiculo{
    private String nombre;
    private double eslora;
    private double calado;
    private double manga;

    public Barcos(String fechaFabricacion, String fechaEntrada, int numeroBastidor, String nombre, double eslora, double calado, double manga) {
        super(fechaFabricacion, fechaEntrada, numeroBastidor);
        this.nombre = nombre;
        this.eslora = eslora;
        this.calado = calado;
        this.manga = manga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    @Override
    public String toString() {
        return "Barcos{" +
                "nombre='" + nombre + '\'' +
                ", eslora=" + eslora +
                ", calado=" + calado +
                ", manga=" + manga +
                '}';
    }
}
