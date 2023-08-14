package com.service.springserviceproject.bbbBussines.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Doktor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface DoktorService {

    List<Doktor> getAllDoktorlarAsc();
    List<Doktor> getAllDoktorlarDesc();


}
