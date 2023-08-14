package com.service.springserviceproject.bbbBussines.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Randevu;

import java.util.List;

public interface RandevuService {
    List<Randevu> getAllByIdRandevular();
}
