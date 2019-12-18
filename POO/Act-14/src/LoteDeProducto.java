public class LoteDeProducto {
    private Producto[] productos;
    private int totalProductos;
    private SelectorDeMejorProducto selector;

    public LoteDeProducto() {
        this.totalProductos = 0;
        productos = new Producto[100];
    }

    public Producto getProductoEnPosicion(int i) throws ProductoException {
       if(i >= 0 && totalProductos>i){
           return productos[i];
       } else {
           throw new ProductoException("No es una posicion valida");
       }
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public void añadirProducto(Producto p) throws ProductoException {
        if (p == null){
            throw new ProductoException("el objeto es nulo");
        } else if (totalProductos > productos.length){
            throw new ProductoException("Esta llena");
        } else {
            productos[totalProductos] = p;
            totalProductos++;
        }
    }

    public void añadirSelector(SelectorDeMejorProducto selector){
        this.selector = selector;
    }

    public Producto mejorProducto() throws ProductoException {
       return selector.mejorProducto(this);
    }

}
