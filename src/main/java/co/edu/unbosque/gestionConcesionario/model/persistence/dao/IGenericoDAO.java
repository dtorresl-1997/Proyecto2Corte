package co.edu.unbosque.gestionConcesionario.model.persistence.dao;

public interface IGenericoDAO<T> {
    void save(T t);
}
