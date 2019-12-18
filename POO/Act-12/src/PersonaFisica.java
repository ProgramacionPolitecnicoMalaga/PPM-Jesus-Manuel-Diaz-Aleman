public class PersonaFisica extends Comprador{

    private String DNI;
    private String Direccion;

    public PersonaFisica(String nombre, String apellidos, String DNI, String direccion) {
        super(nombre, apellidos);
        this.DNI = DNI;
        Direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "PersonaFisica{" +
                "DNI='" + DNI + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
