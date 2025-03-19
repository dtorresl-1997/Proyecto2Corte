package co.edu.unbosque.gestionConcesionario.model.entities;

public class Admin {

    // Parametros
    private String user = "admin";
    private String password = "123";

    // Constructor sin parametros
    public Admin(){}

    // Constructor con parametros
    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    // Getters
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
