package com.springbootlearn.rentACar.business.abstracts;

import com.springbootlearn.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<Brand> getAll();
}
