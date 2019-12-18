import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RankingPilotos {

    ArrayList listaPilotos;
    BufferedReader bufferedReader = null;

    public RankingPilotos() throws IOException {
        this.listaPilotos = new ArrayList<Piloto>();
        try {
            bufferedReader = new BufferedReader(new FileReader("piloto.csv"));
            String linea = bufferedReader.readLine();
            while (null != linea) {
                String[] lineasCSV = linea.split(";");
                Piloto piloto = new Piloto(Integer.parseInt(lineasCSV[0]), lineasCSV[1], lineasCSV[2]);
                añadirPiloto(piloto, piloto.getPosicionDeSalida());
                linea = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void añadirPiloto(Piloto piloto, int posicion){
        try {
            if(listaPilotos.contains(piloto)){
                throw new RankingException("Ya hay un piloto igual en la parrilla");
            }else{
             listaPilotos.add(piloto);
          }
         }catch (RankingException e) {
               e.printStackTrace();
         }
    }

        public void adelantarPiloto(Piloto piloto){
        int pos = listaPilotos.indexOf(piloto);
        retrasarPiloto((Piloto) listaPilotos.get(pos-1));
        listaPilotos.set(pos - 1, piloto);
        }



        public void retrasarPiloto(Piloto piloto){
            int pos = listaPilotos.indexOf(piloto);
            listaPilotos.set(pos + 1, piloto);
        }

        public void eliminarPilotosDescalificados(Piloto piloto){
        if (piloto.isDescalificado() == true){
            listaPilotos.remove(piloto);
        }
    }


        public void ordenarPilotoPorNombre(){
            Collections.sort(listaPilotos);
        }

        public void imprimirPilotos(){
            for(int i = 0; i<listaPilotos.size(); i++){
                System.out.println(listaPilotos.get(i));
            }
        }
    }



