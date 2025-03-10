package co.edu.unbosque.gestionConcesionario.model.services;

import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;
import co.edu.unbosque.gestionConcesionario.model.persistence.dao.IGenericoDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class VehiculoService {

    @Inject
    private IGenericoDAO<Vehiculo, Long> vehiculoDAO;

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculoDAO.save(vehiculo);
    }

    public Vehiculo obtenerVehiculo(Long id) {
        return vehiculoDAO.findById(id);
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculoDAO.findAll();
    }

    public void eliminarVehiculo(Long id) {
        vehiculoDAO.delete(id);
    }
}
