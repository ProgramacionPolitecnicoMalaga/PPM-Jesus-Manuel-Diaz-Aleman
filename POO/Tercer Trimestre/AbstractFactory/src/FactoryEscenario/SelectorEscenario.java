package FactoryEscenario;

public class SelectorEscenario{

    public EscenarioFactory SeleccionarEscenario(int tipo){
        EscenarioFactory abstracFactory = null;
        if (tipo == 0){
            abstracFactory = new SelvaFactory();
        }

        else if (tipo == 1){
            abstracFactory = new DesiertoFactory();
        }

        else if (tipo == 2){
            abstracFactory = new EspacioFactory();
        }
        return abstracFactory;
    }

}
