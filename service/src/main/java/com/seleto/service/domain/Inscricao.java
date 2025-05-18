package com.seleto.service.domain;

import jakarta.persistence.*;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "candidato_id")
    private Candidato candidato;

    @ManyToOne(optional = false)
    @JoinColumn(name = "edital_id")
    private Edital edital;

    @Column(nullable = false)
    private LocalDate dataInscricao;

    @Column(nullable = false)
    private String respostasCriterios;

    @Column(nullable = false)
    private double pontuacaoCalculada;

    public Inscricao() {

    }
}
