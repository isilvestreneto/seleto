package com.seleto.service.controllers;

import com.seleto.service.domain.Inscricao;
import com.seleto.service.domain.InscricaoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InscricaoMapper {
    InscricaoDTO toDTO(Inscricao inscricao);

    Inscricao toEntity(InscricaoDTO inscricaoDTO);
}
