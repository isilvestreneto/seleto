package com.seleto.service.controllers;

import com.seleto.service.domain.Edital;
import com.seleto.service.domain.EditalDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditalMapper {
    EditalDTO toDTO(Edital edital);

    Edital toEntity(EditalDTO dto);
}
