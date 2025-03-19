package co.edu.unbosque.gestionConcesionario.model.persistence.impl;

import co.edu.unbosque.gestionConcesionario.model.dataMappers.VehiculoMapper;
import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;
import co.edu.unbosque.gestionConcesionario.model.persistence.dao.IVehiculoDAO;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class VehiculoDAOImpl implements IVehiculoDAO {

    @PersistenceContext(unitName = "gestionConcesionarioPU")
    private EntityManager em;

    @Override
    public void insertarVehiculo(VehiculoDTO vehiculoDTO) {
        em.persist(vehiculoDTO);
    }

    @Override
    public void actualizarVehiculo(VehiculoDTO vehiculoDTO) {
        em.merge(vehiculoDTO);
    }

    @Override
    public List<VehiculoDTO> obtenerTodos() {
        List<Vehiculo> vehiculos = em.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class).getResultList();
        return vehiculos.stream().map(VehiculoMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public List<VehiculoDTO> obtenerMasSolicitados() {
        List<Vehiculo> vehiculos = em.createQuery("SELECT v FROM Vehiculo v ORDER BY v.reservas DESC", Vehiculo.class)
                .setMaxResults(5)
                .getResultList();
        return vehiculos.stream().map(VehiculoMapper::toDto).collect(Collectors.toList());
    }
}
