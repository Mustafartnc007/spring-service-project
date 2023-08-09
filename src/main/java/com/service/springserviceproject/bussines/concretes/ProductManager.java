package com.service.springserviceproject.bussines.concretes;

import com.service.springserviceproject.bussines.abstracts.ProductService;
import com.service.springserviceproject.dataAcces.abstracts.ProductDao;
import com.service.springserviceproject.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductManager implements ProductService {


    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll()
    {
        return this.productDao.findAll();
    }

}
