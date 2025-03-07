package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.entities.Estudiante;

import java.util.ArrayList;

public class EstudianteDAOImpl implements DAO{
    private static final ArrayList<Estudiante> estudiantes = new ArrayList<>();

    @Override
    public Estudiante save(Estudiante entity) {
        estudiantes.add(entity);
        System.out.println("Estudiante saved");
        return entity;
    }
}
