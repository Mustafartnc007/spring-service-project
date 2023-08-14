package com.service.springserviceproject.aaaEntities.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HastaRepository extends JpaRepository<Hasta, Long> {
    // Özel sorgular eklemek mümkün

    List<Hasta> findAllByOrderByIdAsc();
    List<Hasta> findAllByOrderByIdDesc();
}
