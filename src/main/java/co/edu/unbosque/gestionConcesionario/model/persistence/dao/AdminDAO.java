package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

import co.edu.unbosque.gestionConcesionario.model.dto.AdminDTO;

public class AdminDAO {
    public AdminDTO getAdmin() {
        return new AdminDTO("admin", "123");
    }
}