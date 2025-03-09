package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericoDAO<T, ID> extends Serializable {

    void save(T t);
    T findById(ID id);
    List<T> findAll();
    void update(T t);
    void delete(ID id);
}
