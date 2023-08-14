package com.service.springserviceproject.cccControllers;

import com.service.springserviceproject.bbbBussines.abstracts.HastaService;
import com.service.springserviceproject.aaaEntities.concretes.Hasta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hastalar")
public class HastaController {

    private final HastaService hastaService;

    @Autowired
    public HastaController(HastaService hastaService) {
        this.hastaService = hastaService;
    }

    @GetMapping("/hastalist")
    public List<Hasta> getAllHastalar() {
        return hastaService.getAllHastalar();
    }
}
