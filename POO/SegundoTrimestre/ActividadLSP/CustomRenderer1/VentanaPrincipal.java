package Vistas.VistaPrincipal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.LocalDate;

public class VentanaPrincipal {
    private JPanel pnlMain;
    private JButton btnEliminar;
    private JButton btnNuevo;
    private JList lstItems;

    public VentanaPrincipal(){
        Item item1 = new Item("Juan Morales",LocalDate.of(2020,3,13),"Aplicado el parche #1128 desde Jonatino/patch-1. Resultado aparentemente correcto");
        Item item2 = new Item("José Muñoz",LocalDate.of(2020,3,14),"Los equipos del despacho A33 están esperando la recogida. El equipo de mantenimiento ya lo sabe");
        Item item3 = new Item("Juan Morales",LocalDate.of(2020,3,14),"El servidor de aplicaciones del DC-2 está haciendo dando servicio intermitente. ¿Problema de la red?");
        Item item4 = new Item("Redes Admin",LocalDate.of(2020,3,15),"Problema con el switch P-2 solucionado. Módulo SFP cambiado. El servidor de aplicaciones debería ir bien ya");
        Item item5 = new Item("Juan Morales",LocalDate.of(2020,3,16),"Necesitamos un servidor de despliegue para la aplicación de mensajería.");
        Item item6 = new Item("José Muñoz",LocalDate.of(2020,3,16),"¿Qué configuración debería tener el servidor de despliegue para la aplicación de mensajería? Enviar a admin@seragul.es");

        DefaultListModel<Item> lstModel = new DefaultListModel<>();
        lstModel.addElement(item1);
        lstModel.addElement(item2);
        lstModel.addElement(item3);
        lstModel.addElement(item4);
        lstModel.addElement(item5);
        lstModel.addElement(item6);


        lstItems.setModel(lstModel);
        lstItems.setCellRenderer(new ItemPanel());

        lstItems.setFixedCellWidth(pnlMain.getWidth());

        lstItems.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Estiramos la celda a 1000 px de altura
                lstItems.setFixedCellHeight(1000);
                // Asignamos el valor -1 para que se recalcule la altura
                lstItems.setFixedCellHeight(-1);
            }
        });
    }

    public Container getPanel() {
        return pnlMain;
    }
}

