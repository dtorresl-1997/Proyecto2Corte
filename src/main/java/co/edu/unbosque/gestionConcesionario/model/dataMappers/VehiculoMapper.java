package co.edu.unbosque.gestionConcesionario.model.dataMappers;

import co.edu.unbosque.gestionConcesionario.model.dto.VehiculoDTO;
import co.edu.unbosque.gestionConcesionario.model.entities.Vehiculo;

public class VehiculoMapper {

    public static Vehiculo dtoToEntity(VehiculoDTO vehiculo) {
        return new Vehiculo( vehiculo.getId(), vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getAño(),
                vehiculo.getPrecio(), vehiculo.getKilometraje(), vehiculo.getEstado(), vehiculo.getTipo()
        );
    }
    public static VehiculoDTO toDto(Vehiculo vehiculo) {
        return new VehiculoDTO(
                vehiculo.getId(), vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getAño(),
                vehiculo.getPrecio(), vehiculo.getKilometraje(), vehiculo.getEstado(), vehiculo.getTipo()
        );
    }

}