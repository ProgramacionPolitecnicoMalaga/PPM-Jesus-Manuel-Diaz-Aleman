public class Asalariado extends Empleado{
    private double sueldo;

    public Asalariado(String nombre, String apellidos, double sueldo) {
        super(nombre, apellidos);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "EmpleadoAsalariado{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", sueldo='" + getSueldo() +
                '}';
    }
}

