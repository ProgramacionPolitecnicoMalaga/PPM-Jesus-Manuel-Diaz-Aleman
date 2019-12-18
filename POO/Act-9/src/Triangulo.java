public class Triangulo  extends FiguraGeometrica{
    private double altura,base;

    public Triangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
        calcularArea();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area = altura * base;
        setArea(area);
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
