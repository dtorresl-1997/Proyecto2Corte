package co.edu.unbosque.gestionConcesionario.view.beans;

import co.edu.unbosque.gestionConcesionario.model.dataMappers.AdminDataMapper;
import co.edu.unbosque.gestionConcesionario.model.dto.AdminDTO;
import co.edu.unbosque.gestionConcesionario.model.persistence.dao.AdminDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("adminBean")
@SessionScoped
public class AdminBean implements Serializable {
    private String username;
    private String password;
    private final AdminDAO adminDAO = new AdminDAO();
    private final AdminDataMapper adminDataMapper = new AdminDataMapper();

    public String login() {
        AdminDTO admin = adminDAO.getAdmin();
        if (adminDataMapper.verifyCredentials(username, password, admin)) {
            return "adminPanel.xhtml";
        } else {
            return null;
        }
    }

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
}