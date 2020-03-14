import java.util.ArrayList;

public class Carta {
    private ArrayList<Producto> productos;

    public Carta(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Carta{" +
                "productos=" + productos +
                '}';
    }
}
