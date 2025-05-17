package com.seleto.service.services;

import com.seleto.service.domain.Candidato;
import com.seleto.service.repositories.CandidatoRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

    private final CandidatoRepository candidatoRepository;

    public CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    public Candidato criarCandidato(Candidato candidato) {
        candidato.setStatus_inscricao("PENDENTE");

        Candidato saved = candidatoRepository.save(candidato);

        if (saved != null) {
            return saved;
        }
        // Se o candidato não foi salvo, lança uma exceção
        throw new RuntimeException("Erro ao salvar o candidato");
    }
}
