package com.seleto.service.controllers;

import com.seleto.service.domain.Candidato;
import com.seleto.service.domain.CandidatoDTO;
import com.seleto.service.domain.Documento;
import com.seleto.service.domain.DocumentoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CandidatoMapper {
    Candidato toCandidato(CandidatoDTO candidatoDTO);

    List<DocumentoDTO> toDocumentoDTOList(List<Documento> documentos);

    List<Documento> toDocumentoList(List<DocumentoDTO> dtos);
}
