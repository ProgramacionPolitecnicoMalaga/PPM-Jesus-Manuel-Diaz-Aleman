public class CriterioMejorPrecio implements SelectorMejorProducto{
    @Override
    public Producto eligirMejorProducto(LoteDeProductos lote) {
        double menorPrecio = Double.MAX_VALUE;
        Producto productoMásBarato = null;
        for (int i=0; i<lote.getTotalProductos(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double precioActual = productoActual.getPrecio();
            if (precioActual < menorPrecio){
                menorPrecio = precioActual;
                productoMásBarato = productoActual;
            }
        }
        return productoMásBarato;
    }
}
