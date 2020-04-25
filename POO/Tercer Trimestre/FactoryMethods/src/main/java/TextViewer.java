import java.util.ArrayList;

public class TextViewer implements Viewer{


    public String mostratDatos(ArrayList<Poblacion> poblaciones) {
        String string = "Listado de empadronamientos: \n";
        for (Poblacion poblacion : poblaciones){
            string += " El total de empadronados en " +poblacion.getAño()+  " procedentes de "+poblacion.getNacionalidad()+" fue de "+ poblacion.getNumeroEmpadronado()+ " personas.\n";
        }
        return string;
    }
}
