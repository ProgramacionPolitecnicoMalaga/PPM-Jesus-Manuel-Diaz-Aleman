public class MejorRatio implements SelectorDeMejorProducto{
    @Override
    public Producto mejorProducto(LoteDeProducto lote) throws ProductoException {
        double mejorRatio = Double.MIN_VALUE;
        Producto productoMejorRatio = null;
        for (int i=0; i<lote.getTotalProductos(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double precioActual = productoActual.getPrecio();
            double valoraciónActual = productoActual.getValoracion();
            double ratioActual = valoraciónActual/precioActual;
            if (ratioActual > mejorRatio){
                mejorRatio = ratioActual;
                productoMejorRatio = productoActual;
            }
        }
        return productoMejorRatio;
    }
}

