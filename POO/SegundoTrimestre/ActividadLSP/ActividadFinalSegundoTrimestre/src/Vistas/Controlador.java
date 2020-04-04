package Vistas;

import DAO.UsuarioDAO;
import Encriptador.Encriptador;
import Modelo.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class Controlador implements ActionListener {
    private UsuarioDAO usuarioDAO;
    private Vista vista;

    public Controlador(UsuarioDAO usuarioDAO, Vista vista) {
        this.usuarioDAO = usuarioDAO;
        this.vista = vista;
        vista.cargarDatos(usuarioDAO.mostrar());
    }

    public void crearRegistro() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DRegistrar dialogo = new DRegistrar(datos);
        String nombre = (String) datos.getDato("nombre");
        String contraseña = (String) datos.getDato("contraseña");
        String algoritmo = (String) datos.getDato("algoritmo");
        Encriptador encriptador = new Encriptador(contraseña, algoritmo);
        Usuario usuario = new Usuario(nombre, encriptador.generarHash(), algoritmo);
        usuarioDAO.insertar(usuario);
        vista.cargarDatos(usuarioDAO.mostrar());
    }

    public void crearValidar() throws NoSuchAlgorithmException {
        DataTransfer datos = new DataTransfer();
        DValidar dialogo = new DValidar(datos);
        String nombre = (String) datos.getDato("nombre");
        Usuario usuario = usuarioDAO.buscarUsuario(nombre);
        String contraseña = (String) datos.getDato("contraseña");
        String algoritmo = usuario.getAlgoritmo();
        Encriptador encriptador = new Encriptador(contraseña, algoritmo);
        boolean encriptado = encriptador.verficarClave(usuario.getContraseña());
        System.out.println(encriptado);
        vista.setLabelsPaneIcon(encriptado);
        vista.cargarDatos(usuarioDAO.mostrar());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        if (e.getActionCommand().equals("registrar")) {
                crearRegistro();
        } else if (e.getActionCommand().equals("validar")) {
                crearValidar();
            }
        else if (e.getActionCommand().equals("cargar")){
            Usuario usuario = usuarioDAO.buscarUsuario(vista.getdataSelectedNick());
            vista.cargarDatosUsuario(usuario);
        }
            }catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
        }
    }
}
