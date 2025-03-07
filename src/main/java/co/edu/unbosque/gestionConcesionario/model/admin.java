package co.edu.unbosque.gestionConcesionario.model;

public class admin {
    private String user = "admin";
    private String password = "123";

    public admin(String user, String password) {
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
