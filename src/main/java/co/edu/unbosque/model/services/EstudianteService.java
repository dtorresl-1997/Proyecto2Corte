package co.edu.unbosque.model.services;

import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.model.persistence.DAO;
import co.edu.unbosque.model.persistence.EstudianteDAOImpl;

public class EstudianteService {
    private DAO interfaceDao;

    public EstudianteService() {
        interfaceDao = new EstudianteDAOImpl();
    }

    public EstudianteDTO registrarEstudiante(EstudianteDTO dto) {
        interfaceDao.save(DataMapper.estudianteDTOToEstudiante(dto));
        return dto;
    }
}
