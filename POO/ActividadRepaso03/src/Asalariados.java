public class Asalariados extends Empleado{
    private double cantidadFija;

    public Asalariados(String nombre, String apellidos, double cantidadFija) {
        super(nombre, apellidos);
        this.cantidadFija = cantidadFija;
    }

    public void setCantidadFija(int cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double getSueldo() {
        return cantidadFija;
    }

    public void saludar(){
        System.out.println("Hola soy un asalariado");
    }

    @Override
    public String toString() {
        return "Asalariados{" +
                "cantidadFija=" + cantidadFija +
                '}';
    }
}
