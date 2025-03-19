package co.edu.unbosque.gestionConcesionario.view.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import co.edu.unbosque.gestionConcesionario.model.persistence.dao.AdminDAO;
import java.io.Serializable;
import java.sql.Connection;

@Named("adminBean")
@SessionScoped
public class AdminBean implements Serializable {

    // Parametros
    private String username;
    private String password;
    private boolean autenticado = false;
    private AdminDAO adminDAO;

    // Constructor con parametros
    public AdminBean() {
        Connection connection = ConexionDB.getConnection();
        adminDAO = new AdminDAO(connection);
    }

    // Metodos
    public String login() {
        if (adminDAO.validarAdmin(username, password)) {
            autenticado = true;
            return "adminPanel.xhtml";
        } else {
            return "admin.xhtml";
        }
    }

    public String logout() {
        autenticado = false;
        return "index.xhtml";
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public AdminDAO getAdminDAO() {
        return adminDAO;
    }

    public void setAdminDAO(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }
}
