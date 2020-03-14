public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();

        Mesa mesa = new Mesa(1, 2);
        Mesa mesa2 = new Mesa(2, 4);
        Mesa mesa3= new Mesa(3, 6);
        Mesa mesa4 = new Mesa(4, 8);
        Producto producto = new Producto("aaa", 9.99);
        Producto producto1 = new Producto("bbb", 12);
        Cuenta cuenta = new Cuenta(0);

        cafeteria.addMesa(mesa);
        cafeteria.addMesa(mesa2);
        cafeteria.addMesa(mesa3);
        cafeteria.addMesa(mesa4);


        cafeteria.asignarMesa(mesa);
        cafeteria.asignarMesa(mesa2);

        System.out.println(cafeteria.consultarMesasOcupadas());
        System.out.println(cafeteria.consultarMesasLibres());

        cafeteria.añadirProductoUnaCuenta(0, producto1);
        cafeteria.añadirProductoUnaCuenta(1,producto);
        System.out.println(cafeteria.getCaja().getCuentas());

        cafeteria.asignarPrimeraMesaLibre(6);
        System.out.println(cafeteria.consultarMesasOcupadas());
        System.out.println(cafeteria.consultarMesasLibres());

        cafeteria.cerrarMesa(0);

        System.out.println(cafeteria.consultarMesasOcupadas());
        System.out.println(cafeteria.consultarMesasLibres());

        System.out.println(cafeteria.consultarRecuento());


    }
}
