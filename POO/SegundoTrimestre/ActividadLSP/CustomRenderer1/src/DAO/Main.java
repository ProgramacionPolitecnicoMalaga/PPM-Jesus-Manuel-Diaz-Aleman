package DAO;

import Vistas.VistaPrincipal.Controlador;
import Vistas.VistaPrincipal.Vista;

import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ItemDAO itemDAO = new ConsultasDAO();
        ActionListener ctr = new Controlador(itemDAO, vista);
        vista.setControlador(ctr);
        vista.iniciarVista();
    }


}
