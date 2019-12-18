public class MiMain {
    public static void main(String[] args) throws ProductoException {
        LoteDeProducto lote = new LoteDeProducto();
        Producto p1 = new Producto("p1",4.3,3.2);
        lote.añadirProducto(p1);
        lote.añadirProducto(new Producto("p2",3.5,3));
        try{
            lote.añadirProducto(new Producto("p3",4.9,30));
            lote.añadirProducto(null);
        } catch (ProductoException e){
            System.out.println(e);
            System.out.println("Algunos productos no se han añadido.");
        }

        try {
            lote.getProductoEnPosicion(10);
        } catch (ProductoException e){
            System.out.println(e);
            System.out.println("GFSKDGHFSDGHFSKFDS");
        }

        lote.añadirSelector(new MejorPrecio());

        System.out.println(lote.mejorProducto());

        lote.añadirSelector(new MejorValoracion());

        System.out.println(lote.mejorProducto());

        lote.añadirSelector(new MejorRatio());

        System.out.println(lote.mejorProducto());

    }
}
