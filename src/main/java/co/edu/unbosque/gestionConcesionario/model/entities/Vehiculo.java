package co.edu.unbosque.gestionConcesionario.model.entities;

import java.io.Serializable;
import jakarta.persistence.*;
@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {
    // Asignacion de filas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private int kilometraje;
    private String estado; // NUEVO, USADO
    private String tipo; // CARGA, FAMILIAR, UTILITARIO

    // Constructor sin parametros
    public Vehiculo() {}

    // Constructor con parametros
    public Vehiculo(Long id, String marca, String modelo, int año, double precio, int kilometraje, String estado, String tipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.tipo = tipo;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
