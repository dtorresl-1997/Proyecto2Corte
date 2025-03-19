package co.edu.unbosque.gestionConcesionario.model.services.impl;

import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;
import co.edu.unbosque.gestionConcesionario.model.persistence.dao.IVehiculoDAO;
import co.edu.unbosque.gestionConcesionario.model.services.services.IVehiculoService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class VehiculoServiceImpl implements IVehiculoService {

    @Inject
    private IVehiculoDAO vehiculoDAO;

    @Override
    public void registrarVehiculo(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = new Vehiculo(vehiculoDTO.getId(),vehiculoDTO.getMarca(), vehiculoDTO.getModelo(), vehiculoDTO.getAño(), vehiculoDTO.getPrecio(),
                vehiculoDTO.getKilometraje(), vehiculoDTO.getEstado(), vehiculoDTO.getCategoria());
        vehiculoDAO.save(vehiculo);
    }

    @Override
    public List<VehiculoDTO> obtenerTodos() {
        return vehiculoDAO.findAll().stream().map(vehiculoDTO -> new VehiculoDTO(
                vehiculoDTO.getId(), vehiculoDTO.getMarca(), vehiculoDTO.getModelo(), vehiculoDTO.getAño(), vehiculoDTO.getPrecio(),
                vehiculoDTO.getKilometraje(), vehiculoDTO.getEstado(), vehiculoDTO.getCategoria())).collect(Collectors.toList());
    }

    @Override
    public void actualizarVehiculo(VehiculoDTO vehiculo) {
        vehiculoDAO.actualizarVehiculo(vehiculo);
    }

    @Override
    public List<VehiculoDTO> obtenerVehiculos() {
        return vehiculoDAO.obtenerTodos();
    }

    @Override
    public List<VehiculoDTO> obtenerVehiculosMasSolicitados() {
        return vehiculoDAO.obtenerMasSolicitados(); // Método en el DAO
    }
}
