package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

import co.edu.unbosque.gestionConcesionario.model.dto.AdminDTO;

public class AdminDAO {

    private Connection connection;

    public AdminDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean validarAdmin(String user, String password) {
        String sql = "SELECT * FROM admin WHERE user = ? AND password = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public AdminDTO getAdmin() {
        return new AdminDTO("admin", "123");
    }
}