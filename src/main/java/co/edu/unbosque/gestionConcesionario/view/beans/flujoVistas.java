package co.edu.unbosque.gestionConcesionario.view.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named ("flujoVistas")
@SessionScoped
public class flujoVistas implements Serializable {

    public flujoVistas() {
    }

    public String envioPantallaIndexToAdmin() {
        return "admin.xhtml";
    }

    public String regresoPantallaAdminToIndex() {
        return "index.xhtml";
    }

    public String envioPantallaIndexToUser() {
        return "user.xhtml";
    }

    public String regresoPantallaUserToIndex() {
        return "index.xhtml";
    }
}
