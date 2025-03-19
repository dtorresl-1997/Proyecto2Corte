package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import java.util.List;

public interface IVehiculoDAO {

    void insertarVehiculo(VehiculoDTO vehiculo);
    void actualizarVehiculo(VehiculoDTO vehiculo);
    List<VehiculoDTO> obtenerTodos();
    List<VehiculoDTO> obtenerMasSolicitados();
}
