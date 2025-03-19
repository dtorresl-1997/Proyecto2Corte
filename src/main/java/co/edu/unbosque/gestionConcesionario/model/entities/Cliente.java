package co.edu.unbosque.gestionConcesionario.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    // Parametros
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;

    // Constructor sin parametros
    public Cliente(){}

    // Constructor con parametros
    public Cliente(Long id, String nombre, String apellido, String cedula, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
