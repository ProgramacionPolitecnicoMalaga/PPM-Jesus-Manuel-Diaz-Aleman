import java.util.ArrayList;

public class HTMLViewer implements Viewer{


    public String mostratDatos(ArrayList<Poblacion> poblaciones) {
        String string = "<table> \n" +
                        "   <tr>\n" +
                        "       <th>Nacionalidad</th><th>Año</th><th>Total</th>\n" +
                        "   </tr> \n";
        for (Poblacion poblacion : poblaciones){
            string +=   " <tr>\n" +
                        "       <th>"+poblacion.getNacionalidad()+"</th><th>"+poblacion.getAño()+"</th><th>"+poblacion.getNumeroEmpadronado()+"</th>\n" +
                        " </tr> \n";
        }

             string += "</table>";
        return string ;
    }
}
