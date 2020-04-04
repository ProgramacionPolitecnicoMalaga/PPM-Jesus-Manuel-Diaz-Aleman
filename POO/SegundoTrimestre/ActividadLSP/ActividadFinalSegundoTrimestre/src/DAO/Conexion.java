package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conexionBD() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.44:3306/usuario", "decress", "3625661jmd");
            jdbc:mysql://127.0.0.1/db?serverTimezone="+TimeZone.getDefault().getID()
            if (con != null) {
                System.out.println("Conexión establecida");
            }
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
        return con;
    }


}
