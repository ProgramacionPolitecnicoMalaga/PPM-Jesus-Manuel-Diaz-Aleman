public class Main {
    public static void main(String[] args){
        FiguraGeometrica[] figuras= new FiguraGeometrica[3];
        figuras[0] = new Circulo("azul", 5);
        figuras[1] = new Triangulo("verde", 7, 10);
        figuras[2] = new Cuadrado("rojo", 5);


        for(int i = 0; i<figuras.length; i++){
            System.out.println(figuras[i].toString());
        }
    }

}
