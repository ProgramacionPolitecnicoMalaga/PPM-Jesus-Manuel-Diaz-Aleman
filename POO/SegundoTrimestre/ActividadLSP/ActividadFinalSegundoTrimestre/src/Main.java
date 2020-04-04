import DAO.ConsultasUsuarioDAO;
import Vistas.Controlador;
import Vistas.Vista;

import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ActionListener controlador = new Controlador(new ConsultasUsuarioDAO(), vista);
        vista.setActionListenerControlador(controlador);
        vista.iniciarVista();
    }
}
