public class PorHoras extends Empleado{
    private int cantidad;
    private double precioHora;

    public PorHoras(String nombre, String apellidos,int cantidad, double precioHora) {
        super(nombre, apellidos);
        this.cantidad = cantidad;
        this.precioHora = precioHora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getSueldo(){
        return cantidad*precioHora;
    }

    @Override
    public String toString() {
        return "PorHoras{" +
                "cantidad=" + cantidad +
                ", precioHora=" + precioHora +
                ", sueldoTotal=" + getSueldo() +
                '}';
    }
}
