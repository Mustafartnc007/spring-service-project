package com.service.springserviceproject.dataAcces.abstracts;
import com.service.springserviceproject.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao  extends JpaRepository<Product, Integer>{


}

