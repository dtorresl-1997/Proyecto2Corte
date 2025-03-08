package co.edu.unbosque.gestionConcesionario.view.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named ("flujoVistas")
@SessionScoped
public class flujoVistas implements Serializable {

    public flujoVistas() {
    }

    // From index.xhtml
    public String envioPantallaIndexToAdmin() {return "admin.xhtml";}
    public String envioPantallaIndexToUser() {
        return "user.xhtml";
    }

    // From admin.xhtml
    public String envioPantallaAdminToAdminPanel(){return "adminPanel.xhtml";}

    // From user.xhtml

    // Returns
    public String regresoPantallaToAdmin() {
        return "admin.xhtml";
    }
    public String regresoPantallaToAdminPanel() {return "adminPanel.xhtml";}
    public String regresoPantallaToIndex() {
        return "index.xhtml";
    }
    public String regresoPantallaToUser() {return "user.xhtml";}
    public String regresoPantallaToUserPanel() {return "userPanel.xhtml";}
}
