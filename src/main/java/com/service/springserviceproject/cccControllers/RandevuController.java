package com.service.springserviceproject.cccControllers;

import com.service.springserviceproject.aaaEntities.concretes.Randevu;
import com.service.springserviceproject.bbbBussines.abstracts.RandevuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/randevular")
public class RandevuController {


    private final RandevuService randevuService;

    @Autowired
    public RandevuController(RandevuService randevuService)
    {
        this.randevuService=randevuService;
    }

    @GetMapping("/randevulist")
    public List<Randevu> getAllByIdRandevular()
    {
        return randevuService.getAllByIdRandevular();
    }

}
