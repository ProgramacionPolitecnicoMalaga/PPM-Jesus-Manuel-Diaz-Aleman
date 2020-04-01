package Vistas.VistaPrincipal;



import DAO.ItemDAO;
import Vistas.VistaAgregar.ControladorAgregar;
import Vistas.VistaAgregar.VistaAgregar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private ItemDAO itemDAO;
    private Vista vista;
    public Controlador(ItemDAO itemDAO, Vista vista) {
        this.itemDAO = itemDAO;
        this.vista = vista;
        vista.cargarDatosItem(itemDAO.mostrarItems());
    }

    public void crearVentana() {
        VistaAgregar vistaAgregar = new VistaAgregar();
        JFrame ventana = new JFrame("Agregar Items");
        ControladorAgregar controladorAdd = new ControladorAgregar(itemDAO, vistaAgregar, vista);
        vistaAgregar.setControladorEmpleado(controladorAdd);
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(vistaAgregar);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("nuevo")) {
            crearVentana();
            vista.cargarDatosItem(itemDAO.mostrarItems());
        } else if (e.getActionCommand().equals("eliminar")) {
            String nombre =  JOptionPane.showInputDialog("¿Cual es el autor a eliminar?");
            itemDAO.eliminarItem(nombre);
            int index = vista.getjList().getAnchorSelectionIndex();
            vista.getDefaultListModel().remove(index);
            vista.cargarDatosItem(itemDAO.mostrarItems());
        }
    }
}
