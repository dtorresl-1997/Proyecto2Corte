package co.edu.unbosque.gestionConcesionario.model.dto;

import java.time.LocalDateTime;

public class CotizacionDTO {
    private Long id;
    private Long clienteId;
    private Long vehiculoId;
    private double precioCotizado;
    private LocalDateTime fecha;

    public CotizacionDTO() {}

    public CotizacionDTO(Long id, Long clienteId, Long vehiculoId, double precioCotizado, LocalDateTime fecha) {
        this.id = id;
        this.clienteId = clienteId;
        this.vehiculoId = vehiculoId;
        this.precioCotizado = precioCotizado;
        this.fecha = fecha;
    }

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

    public Long getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(Long vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public double getPrecioCotizado() {
        return precioCotizado;
    }

    public void setPrecioCotizado(double precioCotizado) {
        this.precioCotizado = precioCotizado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
