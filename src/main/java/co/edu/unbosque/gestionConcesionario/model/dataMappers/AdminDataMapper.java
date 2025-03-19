package co.edu.unbosque.gestionConcesionario.model.dataMappers;

import co.edu.unbosque.gestionConcesionario.model.dto.AdminDTO;
import co.edu.unbosque.gestionConcesionario.model.entities.Admin;

import java.util.function.Function;

public class AdminDataMapper extends DataMapper<Admin, AdminDTO>{

    public AdminDataMapper(Function<Admin, AdminDTO> toDTO, Function<AdminDTO, Admin> toEntity) {
        super(toDTO, toEntity);
    }
}