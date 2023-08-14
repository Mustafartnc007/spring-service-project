package com.service.springserviceproject.bbbBussines.concretes;

import com.service.springserviceproject.aaaEntities.abstracts.DoktorRepository;
import com.service.springserviceproject.aaaEntities.concretes.Doktor;
import com.service.springserviceproject.bbbBussines.abstracts.DoktorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorServiceImpl implements DoktorService {

    private final DoktorRepository doktorRepository;

    public DoktorServiceImpl(DoktorRepository doktorRepository)
    {
        this.doktorRepository= doktorRepository;
    }

    public List<Doktor> getAllDoktorlarAsc()
    {
        return doktorRepository.findAllByOrderByIdAsc();
    }

    public List<Doktor>getAllDoktorlarDesc()
    {
        return doktorRepository.findAllByOrderByIdDesc();
    }


}
