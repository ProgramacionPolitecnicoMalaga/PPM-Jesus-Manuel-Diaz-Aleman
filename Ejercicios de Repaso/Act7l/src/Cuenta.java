import java.util.ArrayList;

public class Cuenta {
    private ArrayList<Producto> productos;
    private int numeroDeCuenta;
    private Mesa mesa;
    private double total;

    public Cuenta(int numeroDeCuenta) {
        productos = new ArrayList<>();
        this.numeroDeCuenta = numeroDeCuenta;
        total = 0;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProductoEnCuenta(Producto producto){
        productos.add(producto);
    }

    public double totalCuenta(){
        double total = 0;
        for (Producto producto: productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void cobrarMesa(){
        total = totalCuenta();
        mesa.setOcupada(false);
    }

    public void ocuparMesa(Mesa mesa){
        this.mesa = mesa;
        mesa.setOcupada(true);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "productos=" + productos +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", mesa=" + mesa +
                '}';
    }
}
