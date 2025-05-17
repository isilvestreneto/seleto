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

    public boolean criarCandidato(Candidato candidato) {
        Candidato saved = candidatoRepository.save(candidato);

        if (saved != null) {
            return true;
        }

        return false;
    }
}
