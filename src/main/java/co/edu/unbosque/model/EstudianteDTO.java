package co.edu.unbosque.model;

public class EstudianteDTO {
    private String id;
    private String nombre;

    public EstudianteDTO() {

    }
    public EstudianteDTO(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
