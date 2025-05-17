package com.seleto.service.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record EditalDTO(String titulo, String descricao, @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataInicio,
                        @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataFim) {
}
