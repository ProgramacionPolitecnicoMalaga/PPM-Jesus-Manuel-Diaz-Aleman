import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class GestorTareas {
    private ArrayList<Tarea> tareas;
    private ArrayList<Categoria> categorias;

    public GestorTareas() {
        tareas = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void añadirTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public void añadirCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public ArrayList<Tarea> consultarTarea(){
        ArrayList<Tarea> incompletas = new ArrayList<>();
        for (Tarea tarea: tareas) {
            if(!tarea.isCompletado()){
                incompletas.add(tarea);

            }
        }
        return incompletas;
    }

    public ArrayList<Tarea> eliminarTareaCompletada(){
        ArrayList<Tarea> completadas = new ArrayList<>();
        for (Tarea tarea: tareas) {
            if(tarea.isCompletado()){
                completadas.remove(tarea);
            }
        }
        return completadas;
    }

    public ArrayList<Tarea> consultarTareaEnCategoria(Categoria categoria){
        ArrayList<Tarea> tareasEnCategoria = new ArrayList<>();
        for (Tarea tarea:tareas) {
        if(tarea.getCategoria().equals(categoria)){
            tareasEnCategoria.add(tarea);
        }
        }
        return tareasEnCategoria;
    }

    public ArrayList<Tarea> tareasEnFecha(LocalDate fecha){
        ArrayList<Tarea> tareasEnFecha = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.getFecha().compareTo(fecha) == 0){
                tareasEnFecha.add(tarea);
            }
        }
        return tareasEnFecha;
    }

    public ArrayList<Tarea> tareasEnTiempo(LocalDate fechaActual){
        ArrayList<Tarea> tareaEnTiempo = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if(tarea.getFecha().compareTo(fechaActual) > 0){
                tareaEnTiempo.add(tarea);
            }
        }
        return tareaEnTiempo;
    }

    public ArrayList<Tarea> tareasRetrasadas(LocalDate fechaActual){
        ArrayList<Tarea> tareasRetrasadas = new ArrayList<>();
        for (Tarea tarea : tareas){
            if (tarea.getFecha().compareTo(fechaActual) < 0){
                tareasRetrasadas.add(tarea);
            }
        }
        return tareasRetrasadas;
    }


    @Override
    public String toString() {
        return "GestorTareas{" +
                "tareas=" + tareas +
                ", categorias=" + categorias +
                '}';
    }
}
