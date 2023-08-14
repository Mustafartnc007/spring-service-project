package com.service.springserviceproject.cccControllers;


import com.service.springserviceproject.aaaEntities.concretes.Doktor;
import com.service.springserviceproject.bbbBussines.abstracts.DoktorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doktorlar")
public class DoktorController {

    private final DoktorService doktorService;

    @Autowired
    public DoktorController(DoktorService doktorService)
    {
        this.doktorService=doktorService;
    }


    @GetMapping("/asc")
    public List<Doktor> getAllDoktorlarAsc()
    {
        return doktorService.getAllDoktorlarAsc();
    }
    @GetMapping("/desc")
    public List<Doktor> getAllDoktorlarDesc()
    {
        return  doktorService.getAllDoktorlarDesc();

    }
}


