package com.service.springserviceproject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gettter ve setterlar oluşturur
@AllArgsConstructor //consturactorları oluşturur
@NoArgsConstructor
public class ProductWithCategoryDto {
    private  int id;
    private String productName;
    private String categoryName;

}
