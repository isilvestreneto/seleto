package com.seleto.service.services;

import com.seleto.service.domain.Edital;
import com.seleto.service.repositories.EditalRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class EditalService {
    private final EditalRepository editalRepository;

    public EditalService(EditalRepository editalRepository) {
        this.editalRepository = editalRepository;
    }

    public Edital criarEdital(@Valid Edital edital) {
        Edital savedEdital = editalRepository.save(edital);

        if (savedEdital != null) {
            return savedEdital;
        }

        throw new RuntimeException("Erro ao salvar o edital");
    }
}
