package com.springbootlearn.rentACar.business.rules;

import com.springbootlearn.rentACar.core.utilities.exceptions.BusinessException;
import com.springbootlearn.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {
        if(this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand name already exists");
        }
    }

}
