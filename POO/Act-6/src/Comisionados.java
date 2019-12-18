public class Comisionados extends Empleado{

    private int numeroVentas;
    private double sueldoBase;
    private final double sueldoPorVenta =50;

    public Comisionados(String nombre, String apellidos, int numeroVentas, double sueldoBase) {
        super(nombre, apellidos);
        this.numeroVentas = numeroVentas;
        this.sueldoBase = sueldoBase;
    }

    public double getSueldo() {
        return sueldoBase + (double) numeroVentas * sueldoPorVenta;
    }


    public String toString() {
        return "EmpleadoComisionado{" +
                "nombre='" + this.getNombre() +
                "', apellidos='" + getApellidos() +
                "', sueldo='" + getSueldo() +
                '}';
    }



}
