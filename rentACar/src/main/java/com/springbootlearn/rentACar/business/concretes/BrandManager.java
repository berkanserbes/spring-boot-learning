package com.springbootlearn.rentACar.business.concretes;

import com.springbootlearn.rentACar.business.abstracts.BrandService;
import com.springbootlearn.rentACar.dataAccess.abstracts.BrandRepository;
import com.springbootlearn.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
