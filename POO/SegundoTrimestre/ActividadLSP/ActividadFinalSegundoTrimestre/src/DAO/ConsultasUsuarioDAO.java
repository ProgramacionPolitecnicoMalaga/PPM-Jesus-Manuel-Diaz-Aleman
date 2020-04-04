package DAO;

import DAO.Conexion;
import DAO.UsuarioDAO;
import Modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;

public class ConsultasUsuarioDAO implements UsuarioDAO {
    @Override
    public ArrayList<Usuario> mostrar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String querry = "SELECT * FROM usuario";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
                usuarios.add(usuario);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public boolean insertar(Usuario usuario) {
        boolean registrado = false;

        try {
            Connection con = Conexion.conexionBD();
            String query = "INSERT INTO usuario (nombre,contraseña, algoritmo)" + " VALUES (?, ?, ?)";
            PreparedStatement stm =  con.prepareStatement(query);
            stm.setString (1, usuario.getNombre());
            stm.setString (2, usuario.getContraseña());
            stm.setString (3, usuario.getAlgoritmo());
            registrado = true;
            stm.execute();
            stm.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrado;
    }

    @Override
    public Usuario buscarUsuario(String nick) {
        Usuario usuario = new Usuario();
        String querry = "SELECT * FROM usuario WHERE nombre LIKE '%"+nick+"%'";

        try {
            Connection con = Conexion.conexionBD();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setAlgoritmo(rs.getString("algoritmo"));
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
