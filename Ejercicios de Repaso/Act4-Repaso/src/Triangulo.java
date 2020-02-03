public class Triangulo extends FigurasGeometricas{
    private String tipo;
    private double base, altura, angulos;

    public Triangulo(String color, double perimetro, String tipo, double base, double altura, double angulos) {
        super(color, perimetro);
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.angulos = angulos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAngulos() {
        return angulos;
    }

    public void setAngulos(double angulos) {
        this.angulos = angulos;
    }

    @Override
    public double getArea() {
        return base * altura / 2;
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "tipo='" + tipo + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                ", angulos=" + angulos +
                ", la base del triangulo = " + getArea() +
                '}';
    }


}
