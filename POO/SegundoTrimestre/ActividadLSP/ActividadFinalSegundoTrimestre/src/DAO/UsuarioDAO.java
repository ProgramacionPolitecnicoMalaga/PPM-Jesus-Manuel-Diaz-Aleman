package DAO;

import java.util.ArrayList;
import Modelo.Usuario;
public interface UsuarioDAO {
    ArrayList<Usuario> mostrar();
    boolean insertar(Usuario usuario);
    Usuario buscarUsuario(String nick);
}
