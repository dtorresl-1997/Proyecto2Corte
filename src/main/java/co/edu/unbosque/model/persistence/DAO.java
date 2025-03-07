package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.entities.Estudiante;

public interface DAO {
    Estudiante save(Estudiante entity);
}
