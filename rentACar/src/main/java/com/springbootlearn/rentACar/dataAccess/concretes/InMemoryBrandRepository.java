package com.springbootlearn.rentACar.dataAccess.concretes;

import com.springbootlearn.rentACar.dataAccess.abstracts.BrandRepository;
import com.springbootlearn.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository  implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Honda"));
        brands.add(new Brand(5,"Renault"));
        brands.add(new Brand(6,"Dacia"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}