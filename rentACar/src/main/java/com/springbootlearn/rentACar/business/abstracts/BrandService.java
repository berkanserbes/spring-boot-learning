package com.springbootlearn.rentACar.business.abstracts;

import com.springbootlearn.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
