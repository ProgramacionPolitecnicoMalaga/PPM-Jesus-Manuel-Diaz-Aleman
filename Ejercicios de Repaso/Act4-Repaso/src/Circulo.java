public class Circulo extends FigurasGeometricas{
    private double radio, circunferencia;

    public Circulo(String color, double perimetro, double radio, double circunferencia) {
        super(color, perimetro);
        this.radio = radio;
        this.circunferencia = circunferencia;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", circunferencia=" + circunferencia +
                ", la base del circulo = " + getArea() +
                '}';
    }
}
