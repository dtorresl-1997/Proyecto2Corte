package co.edu.unbosque.gestionConcesionario.model.entities;

public class Admin {
    private String user = "admin";
    private String password = "123";

    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
