public class MejorValoracion implements SelectorDeMejorProducto {

    @Override
    public Producto mejorProducto(LoteDeProducto lote) throws ProductoException {
        double mejorValoracion = Double.MIN_VALUE;
        Producto productoMejorValorado = null;
        for (int i = 0; i<lote.getTotalProductos(); i++){
            Producto productoActual = lote.getProductoEnPosicion(i);
            double valoracionActual = productoActual.getValoracion();
            if (valoracionActual > mejorValoracion){
                mejorValoracion = valoracionActual;
                productoMejorValorado = productoActual;
            }
        }
        return productoMejorValorado;
    }
}
