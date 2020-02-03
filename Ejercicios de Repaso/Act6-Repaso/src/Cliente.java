import java.util.Objects;

public class Cliente {
    private String nombre, apellido, nif;
    private CuentaBancaria cuentaBancaria;


    public Cliente(String nombre, String apellido, String nif, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void pagar(int cantidad){
        cuentaBancaria.restarSaldo(cantidad);
    }

    public void ingresar(int cantidad){
        cuentaBancaria.sumarSaldo(cantidad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nif, cliente.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", cuentaBancaria=" + cuentaBancaria +
                '}';
    }
}
