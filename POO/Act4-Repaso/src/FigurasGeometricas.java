public abstract class FigurasGeometricas {
    private String color;
    private double perimetro;

    public FigurasGeometricas(String color, double perimetro) {
        this.color = color;
        this.perimetro = perimetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "color='" + color + '\'' +
                ", perimetro=" + perimetro +
                '}';
    }
}
