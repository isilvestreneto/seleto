package com.seleto.service.controllers;

import com.seleto.service.domain.Candidato;
import com.seleto.service.domain.CandidatoDTO;
import com.seleto.service.services.CandidatoService;
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
    public ResponseEntity<Candidato> criarCandidato(@RequestBody CandidatoDTO dto) {

        var candidato = candidatoMapper.toCandidato(dto);

        var documentos = candidatoMapper.toDocumentoList(dto.documentos());

        documentos.forEach(doc -> doc.setCandidato(candidato));

        candidato.setDocumentos(documentos);

        boolean criarCandidato = candidatoService.criarCandidato(candidato);


        if (!criarCandidato) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(candidato);
    }
}
