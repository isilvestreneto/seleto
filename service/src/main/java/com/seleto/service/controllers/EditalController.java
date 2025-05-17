package com.seleto.service.controllers;

import com.seleto.service.domain.Edital;
import com.seleto.service.domain.EditalDTO;
import com.seleto.service.services.EditalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/editais")
@RestController
public class EditalController {

    private final EditalService editalService;
    private final EditalMapper editalMapper;

    public EditalController(EditalService editalService, EditalMapper editalMapper) {
        this.editalService = editalService;
        this.editalMapper = editalMapper;
    }

    @PostMapping("/criar")
    public ResponseEntity<Edital> criarEdital(@Valid @RequestBody EditalDTO dto) {
        var edital = editalMapper.toEntity(dto);
        Edital savedEdital = editalService.criarEdital(edital);

        if (savedEdital == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(savedEdital);
    }

}
