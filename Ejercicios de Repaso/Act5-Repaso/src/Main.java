
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        GestorTareas gestorTareas = new GestorTareas();
        gestorTareas.añadirCategoria(new Categoria("ocio", "juegos"));
        Tarea tarea1 = new Tarea(new LocalDate(2015, 02, 02), "ocio", "fsdfsd"));
        gestorTareas.consultarTareaEnCategoria(tarea1)
        gestorTareas.consultarTarea(tarea1);
        gestorTareas.eliminarTareaCompletada(tarea1);
        gestorTareas.tareasEnFecha(tarea1);
        gestorTareas.tareasEnTiempo(tarea1):
        gestorTareas.tareasRetrasadas(tarea1);
    }
}
