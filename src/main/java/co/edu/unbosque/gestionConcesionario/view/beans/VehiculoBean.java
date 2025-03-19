package co.edu.unbosque.gestionConcesionario.view.beans;

import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import co.edu.unbosque.gestionConcesionario.model.services.impl.VehiculoServiceImpl;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class VehiculoBean implements Serializable {

    @Inject
    private VehiculoServiceImpl vehiculoServiceImpl;

    private List<VehiculoDTO> listaVehiculos;
    private List<VehiculoDTO> vehiculosMasSolicitados;

    public void init() {
        listaVehiculos = vehiculoServiceImpl.obtenerVehiculos();
        vehiculosMasSolicitados = vehiculoServiceImpl.obtenerVehiculosMasSolicitados();
    }

    public List<VehiculoDTO> getVehiculosMasSolicitados() {
        return vehiculosMasSolicitados;
    }
}
