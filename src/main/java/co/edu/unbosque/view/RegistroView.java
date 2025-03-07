package co.edu.unbosque.view;

import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.model.entities.Estudiante;
import co.edu.unbosque.model.services.EstudianteService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("registryView")
@SessionScoped
public class RegistroView implements Serializable {
    private EstudianteDTO estudianteDTO;
    private EstudianteService estudianteService;

    public RegistroView() {
        estudianteDTO = new EstudianteDTO();
        estudianteService = new EstudianteService();
    }

    public EstudianteDTO getEstudianteDTO() {
        return estudianteDTO;
    }

    public void setEstudianteDTO(EstudianteDTO estudianteDTO) {
        this.estudianteDTO = estudianteDTO;
    }

    public String registrarEstudiante() {
        estudianteService.registrarEstudiante(estudianteDTO);
        return "respuestaRegistro.xhtml";
    }
}
