package co.edu.unbosque.gestionConcesionario.model.persistence.dao;


import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;

import java.util.List;

public interface VehiculoDAO {
    void guardar(Vehiculo vehiculo);
    Vehiculo buscarPorId(Long id);
    List<Vehiculo> listarTodos();
    void eliminar(Long id);
}