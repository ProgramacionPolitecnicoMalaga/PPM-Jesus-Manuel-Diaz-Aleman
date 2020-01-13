import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("¿Qué unidad desea utilizar? \n"+
        "1. mm\n"+
        "2. cm\n"+
        "3. m\n"+
        "Introduzca una opción:");

        Scanner sc = new Scanner(System.in);
        String unidad = sc.nextLine();

        System.out.println("¿Qué quieres calcular? \n"+
                "1. Calcular la hipotenusa de un triángulo a aprtir de sus catetos.\n" +
                "2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa\n" +
                "3. Calcular el área de un triángulo a partir un cateto y la hipotenusa\n" +
                "4. Caluclar el área de un triángulo a partir de dos catetos.\n"+
                "Introduzca una opción:");

        String opcion = sc.nextLine();

        Utilidad u = new Utilidad(Integer.parseInt(unidad),Integer.parseInt(opcion));

        System.out.println("Introduce las unidades");

        String valor1 = sc.nextLine();
        String valor2 = sc.nextLine();

        u.imprimir(Integer.parseInt(valor1),Integer.parseInt(valor2));

   /*     for(int i =0; i < utilidad.length; i++){
            if (utilidad[i].getHipotenusa() < 0){
                utilidad[i].setHipotenusa(0);
            }
            System.out.println(utilidad[i].toString());
            }
*/


    }
}
