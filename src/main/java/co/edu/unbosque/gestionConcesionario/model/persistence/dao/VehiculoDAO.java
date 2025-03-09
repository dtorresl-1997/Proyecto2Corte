package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class VehiculoDAO implements IGenericoDAO<Vehiculo, Long> {

    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    @Override
    public void save(Vehiculo vehiculo) {
        em.persist(vehiculo);
    }

    @Override
    public Vehiculo findById(Long id) {
        return em.find(Vehiculo.class, id);
    }

    @Override
    public List<Vehiculo> findAll() {
        return em.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class).getResultList();
    }

    @Override
    public void update(Vehiculo vehiculo) {
        em.merge(vehiculo);
    }

    @Override
    public void delete(Long id) {
        Vehiculo vehiculo = findById(id);
        if (vehiculo != null) {
            em.remove(vehiculo);
        }
    }
}
