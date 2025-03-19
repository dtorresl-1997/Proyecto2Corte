package co.edu.unbosque.gestionConcesionario.model.services.services;

import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import java.util.List;

public interface IVehiculoService {
    void registrarVehiculo(VehiculoDTO vehiculo);
    void actualizarVehiculo(VehiculoDTO vehiculo);
    List<VehiculoDTO> obtenerVehiculos();
    List<VehiculoDTO> obtenerVehiculosMasSolicitados();
}
