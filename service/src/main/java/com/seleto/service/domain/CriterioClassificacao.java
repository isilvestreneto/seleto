package com.seleto.service.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class CriterioClassificacao {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nome; // (ex: Idade, Graduação, Doação de Sangue)

    // converter em enum depois
    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private double peso; // (ex: 0.5, 1.0, 2.0) - peso do critério na classificação

    public CriterioClassificacao() {

    }

}
