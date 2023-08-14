package com.service.springserviceproject.aaaEntities.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoktorRepository extends JpaRepository<Doktor, Long> {


    List<Doktor> findAllByOrderByIdAsc();
    List<Doktor> findAllByOrderByIdDesc();


}
