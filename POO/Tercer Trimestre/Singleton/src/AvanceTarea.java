public class AvanceTarea {

    private Tareas tareas = Tareas.getInstance();


    public void avanzar(int numeroDeTareas) {
        if (numeroDeTareas > 0) {
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        } else {
            System.out.println("El numero de tareas a realizar debe ser mayor que 0");
        }
    }

    public String mostrarUltimaTareaRealizada(){
        return tareas.getUltimaTareaRealizada();
    }
}
