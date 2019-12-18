public class PorHoras extends Empleado{
    private double horasTrabajadas, sueldoHora;

    public PorHoras(String nombre, String apellidos, double horasTrabajadas, double sueldoHora) {
        super(nombre, apellidos);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoHora = sueldoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }


    @Override
    public double getSueldo(){
        return getHorasTrabajadas()*getSueldoHora();
    }

    public String toString() {
        return "EmpleadoPorHoras{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", sueldo='" + getSueldo() +
                '}';
    }
}
