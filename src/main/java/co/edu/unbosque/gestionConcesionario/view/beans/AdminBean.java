package co.edu.unbosque.gestionConcesionario.view.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("adminBean")
@SessionScoped
public class AdminBean implements Serializable {
    private String usuario;
    private String contrasena;
    private boolean autenticado;

    public String validarAdmin() {
        if ("admin".equals(usuario) && "123".equals(contrasena)) {
            autenticado = true;
            return "adminPanel.xhtml?faces-redirect=true";
        } else {
            return "";
        }
    }

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
