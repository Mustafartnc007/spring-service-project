package com.service.springserviceproject.bussines.abstracts;


import com.service.springserviceproject.entities.concretes.Product;

import java.util.List;

public interface ProductService  {

    List<Product> getAll();

}
