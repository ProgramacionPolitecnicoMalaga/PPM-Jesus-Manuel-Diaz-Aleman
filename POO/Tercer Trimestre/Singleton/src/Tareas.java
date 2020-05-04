import java.util.ArrayList;

public class Tareas {
    private Integer ultimaTareaRealizada = null;
    private ArrayList<String> listaTareas;
    private static Tareas tareas = null;

    private Tareas() {
        listaTareas = new ArrayList<>();
        this.ultimaTareaRealizada = -1;
    }


    public ArrayList<String> getListaTareas() {
        return listaTareas;
    }

    public static Tareas getTareas() {
        return tareas;
    }

    public static Tareas getInstance(){
        if (tareas == null){
            tareas = new Tareas();
        } else{
            System.out.println("Ya se ha creado una tarea");
        }
        return tareas;
    }

    public void addTarea(String nuevaTarea){
        listaTareas.add(nuevaTarea);
    }

    public String getUltimaTareaRealizada() {
        String tarea = null;
        if (ultimaTareaRealizada == null || ultimaTareaRealizada <= -1){
            System.out.println("No se ha realizado ninguna tarea aun");
        } else{
            tarea = listaTareas.get(ultimaTareaRealizada);
        }
        return tarea;
    }

    public void cambiarUltimaTareaRealizada(int numeroDeTareas){
        if (listaTareas.size() > ultimaTareaRealizada + numeroDeTareas && numeroDeTareas > 0){
            ultimaTareaRealizada += numeroDeTareas;

        } else if (ultimaTareaRealizada + numeroDeTareas > -1 && numeroDeTareas < 0){
            ultimaTareaRealizada += numeroDeTareas;
        }
    }
}
