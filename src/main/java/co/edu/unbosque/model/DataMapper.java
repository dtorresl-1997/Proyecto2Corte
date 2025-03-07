package co.edu.unbosque.model;

import co.edu.unbosque.model.entities.Estudiante;

public class DataMapper {
        public static EstudianteDTO estudianteToEstudianteDTO(Estudiante est){
            return new EstudianteDTO(est.getId(), est.getNombre());
        }

        public static Estudiante estudianteDTOToEstudiante(EstudianteDTO est){
            return new Estudiante(est.getId(), est.getNombre());
        }
    }

