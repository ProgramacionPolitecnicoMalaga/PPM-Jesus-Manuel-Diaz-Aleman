public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
        calcularArea();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(lado,2);
        setArea(area);
        return area;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
