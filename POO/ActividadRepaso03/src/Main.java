public class Main {
    public static void main(String[] args){
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new PorHoras("Jesus", "Matinez Sasf", 40, 10);
        empleados[1] = new Comisionados("Arturo", "Aladias Fasdfd", 30, 20);
        empleados[2] = new Asalariados("Ale", "Coekd Lkjhg", 40);


        for(int i = 0; i<empleados.length; i++){
            System.out.println(empleados[i].toString() + "\n");
        }

        for(int i = 0; i<empleados.length; i++){
            empleados[i].saludar();
        }
    }
}
