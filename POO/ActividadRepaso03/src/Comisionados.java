public class Comisionados extends Empleado{
    private double sueldoBase;
    private int ventas;
    private final int sueldoExtra = 50;

    public Comisionados(String nombre, String apellidos, double sueldoBase, int ventas) {
        super(nombre, apellidos);
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoExtra() {
        return sueldoExtra;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getSueldo(){
        return sueldoBase + getVentas() * sueldoExtra;
    }

    public void saludar(){
        System.out.println("Hola soy un comisionado");
    }

    @Override
    public String toString() {
        return "Comisionados{" +
                "sueldoBase=" + sueldoBase +
                ", ventas=" + ventas +
                ", sueldoExtra=" + sueldoExtra +
                ", sueldoTotal=" + getSueldo() +
                '}';
    }
}
