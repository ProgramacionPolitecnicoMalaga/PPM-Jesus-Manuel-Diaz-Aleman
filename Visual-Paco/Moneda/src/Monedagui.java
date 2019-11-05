import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monedagui {
    private JPanel panelMain;
    private JButton butTirar;
    private JButton butLimpiar;
    private JTextField vecesTiradas;
    private JTextField cantidadDeTiradas;
    private JTextField vecesCara;
    private JTextField vecesCruz;
    private double TirarBoton;
    private double Porcentaje;
    private int limpiarCantidad;
}
    public Monedagui() {
        butTirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidadIntroducida = vecesTiradas.getText();
                if (cantidadIntroducida.matches("[1-100%]+")) {
                    int vecesIntroducidas = Integer.parseInt(cantidadIntroducida);
                    if (cantidadIntroducida<=TirarBoton){
                        if (TirarBoton<cantidadIntroducida){
                            vecesTiradas.setText("");
                            vecesTiradas.grabFocus();
                            cantidadDeTiradas.setText("el numero de tiradas tiene que ser menor a 100");
                        }
                        else if (TirarBoton>cantidadIntroducida){
                                vecesTiradas.setText("");
                                vecesTiradas.grabFocus();
                                vecesTiradas.setText("El numero de tiradas tiene que ser mayor a 0");
                        }
                        vecesTiradas.setText("Introduzca cantidad de veces a tirar");
                    } else {
                        TirarBoton = (int) ((Math.random() * Porcentaje));
                        butTirar.setEnabled(true);
                        butLimpiar.setEnabled(false);
                        cantidadDeTiradas.setEnabled(false);
                        vecesTiradas.setEnabled(true);
                        vecesCara.setText("");
                        vecesCruz.setText("");
                    }
                } else {
                    vecesTiradas.setText("Introduzca cantidad de veces a tirar");
                }
            }
        });

        butLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel cantidadTiradas = null;
                String cantidadIntroducida = cantidadTiradas.getText();
                if (cantidadIntroducida.matches("[1-100]+")) {
                    int Limpiar= Integer.parseInt(cantidadIntroducida);
                    if (Porcentaje < -1) {
                        cantidadTiradas.setText("¿Seguro quieres reiniciar la cantidad de tiradas?");
                    } else {
                        limpiarCantidad = (int) ((Math.random() * Porcentaje));
                        butTirar.setEnabled(true);
                        butLimpiar.setEnabled(false);
                        cantidadDeTiradas.setEnabled(true);
                        cantidadTiradas.setEnabled(false);
                        vecesCara.setText("");
                        vecesCruz.setText("");
                    }
                } else {
                    cantidadTiradas.setText("¿Seguro quieres reiniciar la cantidad de tiradas?");
                }
            }
        });
        public static void main(String[] args) {
            JFrame frame = new JFrame("CaraoCruz");
            frame.setContentPane(new Monedagui().panelMain);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }
    }
