package com.springbootlearn.rentACar.dataAccess.abstracts;

import com.springbootlearn.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
