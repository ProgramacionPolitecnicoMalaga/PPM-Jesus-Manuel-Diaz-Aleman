public class Main {
    public static void main(String[] args) {
        Tareas tareas = Tareas.getInstance();
        AvanceTarea avanceTarea = new AvanceTarea();
        RetrocesoTarea retrocesoTarea = new RetrocesoTarea();
        tareas.addTarea("0");
        tareas.addTarea("1");
        tareas.addTarea("2");
        tareas.addTarea("3");
        avanceTarea.avanzar(3);
        System.out.println(avanceTarea.mostrarUltimaTareaRealizada());
        retrocesoTarea.retroceder(-1);
        System.out.println(retrocesoTarea.mostrarUltimaTareaRealizada());



    }
}
