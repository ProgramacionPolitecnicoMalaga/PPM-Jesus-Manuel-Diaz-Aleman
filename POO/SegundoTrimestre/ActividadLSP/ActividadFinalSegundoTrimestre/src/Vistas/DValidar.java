package Vistas;

import Vistas.DataTransfer;

import javax.swing.*;
import java.awt.event.*;

public class DValidar extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNickV;
    private JPasswordField txtPassV;
    private DataTransfer dataTransfer;

    public DValidar(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        setLocationRelativeTo(getParent());
        pack();
        setVisible(true);
    }

    private void onOK() {
        dataTransfer.setDato("nombre",txtNickV.getText());
        char[] array = txtPassV.getPassword();
        String clave = new String(array);
        dataTransfer.setDato("clave",clave);
        dispose();
    }

    private void onCancel() {
        dispose();
    }

}
