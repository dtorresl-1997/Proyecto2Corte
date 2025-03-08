package co.edu.unbosque.gestionConcesionario.model.dataMappers;

import co.edu.unbosque.gestionConcesionario.model.dto.AdminDTO;

public class AdminDataMapper {
    public boolean verifyCredentials(String username, String password, AdminDTO admin) {
        return admin.getUsername().equals(username) && admin.getPassword().equals(password);
    }
}