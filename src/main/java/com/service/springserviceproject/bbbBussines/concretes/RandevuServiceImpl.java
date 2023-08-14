package com.service.springserviceproject.bbbBussines.concretes;

import com.service.springserviceproject.aaaEntities.abstracts.RandevuRepository;
import com.service.springserviceproject.aaaEntities.concretes.Randevu;
import com.service.springserviceproject.bbbBussines.abstracts.RandevuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RandevuServiceImpl  implements RandevuService {


    private  final RandevuRepository randevuRepository;

    public RandevuServiceImpl(RandevuRepository randevuRepository) {
        this.randevuRepository = randevuRepository;
    }


    @Override
    public  List<Randevu> getAllByIdRandevular()
    {
        return randevuRepository.findAll();
    }


}
