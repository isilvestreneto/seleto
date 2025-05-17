package com.seleto.service.domain;

import java.time.LocalDate;
import java.util.List;

public record CandidatoDTO(String nome, String cpf, LocalDate dataNascimento, String email, String telefone,
                           List<DocumentoDTO> documentos) {

}
