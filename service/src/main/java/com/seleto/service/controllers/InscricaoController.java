package com.seleto.service.controllers;

import com.seleto.service.domain.InscricaoDTO;
import com.seleto.service.services.InscricaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController(value = "inscricao")
@RequestMapping
public class InscricaoController {

    private final InscricaoService inscricaoService;
    private final InscricaoMapper inscricaoMapper;

    public InscricaoController(InscricaoService inscricaoService, InscricaoMapper inscricaoMapper) {
        this.inscricaoService = inscricaoService;
        this.inscricaoMapper = inscricaoMapper;
    }

    @PostMapping
    ResponseEntity<InscricaoDTO> criarInscricao(InscricaoDTO dto) {
        // Mapeia o DTO para a entidade
        var inscricao = inscricaoMapper.toEntity(dto).builder().dataInscricao(LocalDate.now()).build();

        // Chama o serviço para criar a inscrição
        inscricaoService.criarInscricao(inscricao);

        // Retorna o DTO da inscrição criada
        return ResponseEntity.status(201).body(inscricaoMapper.toDTO(inscricao));
    }

}
