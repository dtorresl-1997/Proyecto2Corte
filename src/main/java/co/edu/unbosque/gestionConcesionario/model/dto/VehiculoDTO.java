package co.edu.unbosque.gestionConcesionario.model.dto;

public class VehiculoDTO {

    // Variables
    private Long id;
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private int kilometraje;
    private String estado; // Nuevo, Usado, Vendido, Reservado
    private String categoria; // Carga, Familiar, Utilitario

    // Constructor sin parametros
    public VehiculoDTO() {}

    // Constructor con parámetros
    public VehiculoDTO(Long id, String marca, String modelo, int año, double precio, int kilometraje, String estado, String categoria) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
