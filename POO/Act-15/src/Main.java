import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            RankingPilotos p1 = new RankingPilotos();
            p1.imprimirPilotos();
            System.out.println("---------------------------");
            p1.ordenarPilotoPorNombre();
            p1.imprimirPilotos();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
