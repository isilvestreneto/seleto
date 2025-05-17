package com.seleto.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Entity
@Data
@Builder
@AllArgsConstructor
public class Documento {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String url;

    @ManyToOne
    @JoinColumn(name = "candidato_id")
    @JsonIgnore
    private Candidato candidato;

    public Documento() {

    }
}