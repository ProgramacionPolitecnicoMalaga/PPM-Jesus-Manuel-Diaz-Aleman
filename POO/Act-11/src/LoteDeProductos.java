public class LoteDeProductos {
    private Producto[] producto;
    private int totalProducto;

    public LoteDeProductos(Producto[] producto, int totalProducto) {
        this.producto = producto;
        this.totalProducto = totalProducto;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public int getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(int totalProducto) {
        this.totalProducto = totalProducto;
    }

    public Producto getProductoEnPosicion(int i){
        if ((i >=0) && (i<totalProducto))
            return producto[i];
        else
            return null;
    }

    public void addProducto(Producto producto){
        if (totalProducto < producto.length){
            producto[totalProducto] = producto;
            totalProducto++;
        }
    }

    public int getTotalProductos() {
    }
}
