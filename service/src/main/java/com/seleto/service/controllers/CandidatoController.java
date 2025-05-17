package com.seleto.service.controllers;

import com.seleto.service.domain.Candidato;
import jakarta.validation.Valid;
import com.seleto.service.domain.CandidatoDTO;
import com.seleto.service.services.CandidatoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    private final CandidatoService candidatoService;
    private final CandidatoMapper candidatoMapper;

    public CandidatoController(CandidatoService candidatoService, CandidatoMapper candidatoMapper) {
        this.candidatoService = candidatoService;
        this.candidatoMapper = candidatoMapper;
    }

    @PostMapping
    public ResponseEntity<CandidatoDTO> criarCandidato(@Valid @RequestBody CandidatoDTO dto) {
        // Mapeia o DTO para a entidade
        var candidato = candidatoMapper.toCandidato(dto);

        // Processa os documentos e associa ao candidato
        var documentos = candidatoMapper.toDocumentoList(dto.documentos());
        documentos.forEach(doc -> doc.setCandidato(candidato));
        candidato.setDocumentos(documentos);

        // Chama o serviço para criar o candidato
        Candidato salvo = candidatoService.criarCandidato(candidato);
        var dtoRetorno = candidatoMapper.toCandidatoDTO(salvo);

        // Retorna o DTO do candidato criado
        var candidatoCriadoDTO = candidatoMapper.toCandidatoDTO(candidato);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoRetorno);
    }
}
