package co.edu.unbosque.gestionConcesionario.model.dto;

import java.time.LocalDateTime;

public class CitaDTO {
    private Long id;
    private Long clienteId;
    private String motivo;
    private LocalDateTime fecha;

    public CitaDTO() {}

    public CitaDTO(Long id, Long clienteId, String motivo, LocalDateTime fecha) {
        this.id = id;
        this.clienteId = clienteId;
        this.motivo = motivo;
        this.fecha = fecha;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}

