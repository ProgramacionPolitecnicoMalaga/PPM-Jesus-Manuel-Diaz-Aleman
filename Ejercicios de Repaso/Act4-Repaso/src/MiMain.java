import java.util.ArrayList;

public class MiMain {
    public static void main(String[] args){
        ArrayList<FigurasGeometricas> figuras = new ArrayList<>();
        Circulo c = new Circulo("azul", 8, 6.3, 3);
        Triangulo t = new Triangulo("verde", 4, "rectangulo", 6.9, 8.5, 3);
        Cuadrado q = new Cuadrado("rojo", 4.4, 8.75);

        System.out.println(c.toString());

        System.out.println(t.toString());

        System.out.println(q.toString());



    }
}
