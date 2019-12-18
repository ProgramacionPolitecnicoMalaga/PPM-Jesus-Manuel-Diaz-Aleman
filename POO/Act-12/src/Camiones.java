public class Camiones extends Vehiculo{
    private String matricula;
    private double ancho;
    private double altura;
    private double longitud;

    public Camiones(String fechaFabricacion, String fechaEntrada, int numeroBastidor, String matricula, double ancho, double altura, double longitud) {
        super(fechaFabricacion, fechaEntrada, numeroBastidor);
        this.matricula = matricula;
        this.ancho = ancho;
        this.altura = altura;
        this.longitud = longitud;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Camiones{" +
                "matricula='" + matricula + '\'' +
                ", ancho=" + ancho +
                ", altura=" + altura +
                ", longitud=" + longitud +
                '}';
    }
}
