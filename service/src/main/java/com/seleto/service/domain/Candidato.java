package com.seleto.service.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documento> documentos = new ArrayList<>();

    @Column(nullable = false)
    private String status_inscricao = "PENDENTE"; // (ex: DEFERIDO, INDEFERIDO)

    @Column(nullable = false)
    private Double pontuacaoFinal = 0.0; // (ex: 0.0, 1.0, 2.0) - pontuação final do candidato

    public Candidato() {

    }

}
