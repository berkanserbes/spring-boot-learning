package com.springbootlearn.rentACar.dataAccess.abstracts;

import com.springbootlearn.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
