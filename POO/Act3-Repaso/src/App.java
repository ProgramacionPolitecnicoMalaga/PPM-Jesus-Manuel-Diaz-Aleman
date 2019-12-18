import java.util.ArrayList;

public class App {
    public static void main(String[] args){


        Producto p1 = new Producto("P1");
        Producto p2 = new Producto("P2");

        p1.setEspecificacion(new Componente("C1", 7));
        p1.setEspecificacion(new Componente("C2", 10));
        p1.setEspecificacion(new Componente("C3", 4));


        Inventario inventario = new Inventario();
        inventario.add(new Componente("C1", 0), 100);
        inventario.add(new Componente("C2", 0), 100);
        inventario.add(new Componente("C3", 0), 60);

        ArrayList<Componente> escasos = inventario.minimaExistencia(p1);
        while (escasos.size()==0){
            inventario.contabilizaProducto(p1);
            escasos = inventario.minimaExistencia(p1);
        }
    if (escasos.size()>0)
        System.out.println("No quedan existencias de los productos");
        System.out.println(escasos);
        System.out.println(inventario);


    Inventario inventario1

    }

}
