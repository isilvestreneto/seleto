package com.seleto.service.services;

import com.seleto.service.domain.Inscricao;
import com.seleto.service.repositories.InscricaoRepository;
import org.springframework.stereotype.Service;

@Service
public class InscricaoService {

    private final InscricaoRepository inscricaoRepository;


    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    public Inscricao criarInscricao(Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }
}
