public class Cuadrado extends FigurasGeometricas{
    private double lados;

    public Cuadrado(String color, double perimetro, double lados) {
        super(color, perimetro);
        this.lados = lados;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    @Override
    public double getArea() {
        return Math.pow(lados, 2);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lados=" + lados +
                ", la base del cuadrado = " + getArea() +
                '}';
    }
}
