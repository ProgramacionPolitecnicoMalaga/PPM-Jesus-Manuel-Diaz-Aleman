public class MejorPrecio implements SelectorDeMejorProducto{

    @Override
    public Producto mejorProducto(LoteDeProducto lote) throws ProductoException {
        double menorPrecio = Double.MAX_VALUE;
        Producto productoMásBarato = null;
        for (int i = 0; i<lote.getTotalProductos(); i++){
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

