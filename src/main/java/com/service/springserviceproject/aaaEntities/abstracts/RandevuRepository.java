package com.service.springserviceproject.aaaEntities.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Hasta;
import com.service.springserviceproject.aaaEntities.concretes.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu ,Long> {

    List<Hasta> findAllByOrderByIdAsc();
    List<Hasta> findAllByOrderByIdDesc();


}
