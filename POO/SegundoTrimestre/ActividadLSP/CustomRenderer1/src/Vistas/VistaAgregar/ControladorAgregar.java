package Vistas.VistaAgregar;

import DAO.ItemDAO;
import Modelo.Item;
import Vistas.VistaPrincipal.Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class ControladorAgregar implements ActionListener {
    private ItemDAO itemDAO;
    private VistaAgregar vistaAgregar;
    private Vista vista;

    public ControladorAgregar(ItemDAO itemDAO, VistaAgregar vistaAgregar, Vista vista) {
        this.itemDAO = itemDAO;
        this.vistaAgregar = vistaAgregar;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("agregar")) {
            String autor = vistaAgregar.getTxtNombre();
            LocalDate fecha = LocalDate.parse(vistaAgregar.getTxtFecha());
            String texto = vistaAgregar.getTxtTexto();
            String tema = vistaAgregar.getBoxSelecionado();
            Item item = new Item(autor, fecha, texto, tema);
            itemDAO.insertarItem(item);
            vista.cargarDatosItem(itemDAO.mostrarItems());
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.exit(1);
        }
    }
}
