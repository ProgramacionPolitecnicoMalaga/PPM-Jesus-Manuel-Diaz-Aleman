public class Main {
    public static void main(String[] args){
        Empleado[] empleados = new Empleado[4];
        empleados[1] = new PorHoras("Juan", "Fernández", 5, 30);
        empleados[2] = new Asalariado("Juan", "Fernández", 5);
        empleados[3] = new Comisionados("Juan", "Fernández", 5, 1000);

        for(int i = 0; i<empleados.length; i++){
            System.out.println(empleados[i].toString() + "\n");
        }
    }

}
