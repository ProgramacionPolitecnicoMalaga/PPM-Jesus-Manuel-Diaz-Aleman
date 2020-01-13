public class Utilidad {
    int unidad;
    int opcion;

    public Utilidad(int unidad, int opcion) {
        this.unidad = unidad;
        this.opcion = opcion;
    }

    public double opcion1(double cateto1, double cateto2){
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public double opcion2(double hypo, double cateto2){
       return Math.sqrt(Math.pow(hypo, 2) - Math.pow(cateto2, 2));
    }

    public double opcion3(double hypo, double cateto){
        double cateto2 = Math.sqrt(Math.pow(hypo, 2) - Math.pow(cateto, 2));
        return cateto*cateto2;
    }

    public double opcion4(double cateto1, double cateto2){
        return cateto1*cateto2;
    }

    public double operaciones(double valor1, double valor2){
        double res = 0;
        if(opcion==1) res = opcion1(valor1,valor2);
        else if(opcion==2) res =  opcion2(valor1,valor2);
        else if(opcion==3) res =  opcion3(valor1,valor2);
        else if(opcion==4) res =  opcion4(valor1,valor2);

        return res;
    }


    public String unidades(){
        String res = null;
        if(unidad==1) res = "mm";
        else if(unidad==2) res = "cm";
        else if(unidad==3) res =  "m";
        return res;
    }

    public void imprimir(double valor1, double valor2){
        if(opcion==1) System.out.println("La hipotenusa es: "+operaciones(valor1,valor2) + unidades());
        else if(opcion==2) System.out.println("El cateto1 es: "+operaciones(valor1,valor2) + unidades());
        else if(opcion==3)  System.out.println("El area de un trialgulo a partir de un cateto y la hipotenusa es igual a: " + operaciones(valor1,valor2) + unidades());
        else if(opcion==4)  System.out.println("El area de un triangulo a partir de dos catetos es: " +operaciones(valor1,valor2) + unidades());
    }

}
