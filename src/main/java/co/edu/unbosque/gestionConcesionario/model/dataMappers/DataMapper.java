package co.edu.unbosque.gestionConcesionario.model.dataMappers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class DataMapper<E, D> {

    // Parametros
    private final Function<E, D> toDTO;
    private final Function<D, E> toEntity;

    // Constructor con parametros
    public DataMapper(Function<E, D> toDTO, Function<D, E> toEntity) {
        this.toDTO = toDTO;
        this.toEntity = toEntity;
    }

    // Metodos
    public D entityToDTO(E entity) {
        return toDTO.apply(entity);
    }

    public E dtoToEntity(D dto) {
        return toEntity.apply(dto);
    }

    public List<D> entityListToDTOList(List<E> entities) {
        return entities.stream().map(toDTO).collect(Collectors.toList());
    }

    public List<E> dtoListToEntityList(List<D> dtos) {
        return dtos.stream().map(toEntity).collect(Collectors.toList());
    }
}