package co.edu.unbosque.gestionConcesionario.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    // Parametros
    private static Connection conexion;

    // Constructor sin parametros
    private ConexionDB() {}

    //
    public static Connection getConnection() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bosquecar", "root", "password");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexion;
    }
}
