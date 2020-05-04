public class RetrocesoTarea {
    private Tareas tareas = Tareas.getInstance();


    public void retroceder(int numeroDeTareas) {
        if (numeroDeTareas < 0) {
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        } else {
            System.out.println("El numero de tareas a retroceder debe ser menor que 0");
        }
    }

    public String mostrarUltimaTareaRealizada(){
        return tareas.getUltimaTareaRealizada();
    }
}
