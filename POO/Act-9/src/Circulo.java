public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
        calcularArea();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(radio,2) * Math.PI;
        setArea(area);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}

