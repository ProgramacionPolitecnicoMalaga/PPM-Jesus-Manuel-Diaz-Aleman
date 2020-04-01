import com.politecnicomalaga.calculadora.Division;
import com.politecnicomalaga.calculadora.Multiplicacion;
import com.politecnicomalaga.calculadora.Resta;
import com.politecnicomalaga.calculadora.Suma;

public class Calcular {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        System.out.println(suma.Suma(6, 7));
        System.out.println(resta.Resta(6, 3));
        System.out.println(multiplicacion.Multiplicar(4, 3));
      System.out.println(division.Dividir(9, 3));

    }
}
