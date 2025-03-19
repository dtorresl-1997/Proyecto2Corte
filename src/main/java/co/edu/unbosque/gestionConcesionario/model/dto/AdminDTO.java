package co.edu.unbosque.gestionConcesionario.model.dto;

public class AdminDTO {

    // Parametros
    private String user;
    private String password;

    // Constructor sin parametros
    public AdminDTO(){}

    // Constructor con parametros
    public AdminDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    // Getters & Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

