package com.seleto.service.repositories;

import com.seleto.service.domain.Edital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditalRepository extends JpaRepository<Edital, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Por exemplo, encontrar editais por status ou data de criação
}
