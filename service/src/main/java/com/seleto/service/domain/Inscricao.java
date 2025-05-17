package com.seleto.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Inscricao {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long idCandidato;

    @Column(nullable = false)
    private Long idEdital;

    @Column(nullable = false)
    private LocalDate dataInscricao;

    @Column(nullable = false)
    private String respostasCriterios;

    @Column(nullable = false)
    private double pontuacaoCalculada;

    public Inscricao() {

    }
}
