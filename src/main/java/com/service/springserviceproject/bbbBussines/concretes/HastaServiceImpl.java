package com.service.springserviceproject.bbbBussines.concretes;

import com.service.springserviceproject.aaaEntities.abstracts.HastaRepository;
import com.service.springserviceproject.aaaEntities.concretes.Hasta;
import com.service.springserviceproject.bbbBussines.abstracts.HastaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HastaServiceImpl implements HastaService {

    private final HastaRepository hastaRepository;


    public HastaServiceImpl(HastaRepository hastaRepository) {
        this.hastaRepository = hastaRepository;
    }

    @Override
    public List<Hasta> getAllHastalar() {
        return hastaRepository.findAll();
    }
}
