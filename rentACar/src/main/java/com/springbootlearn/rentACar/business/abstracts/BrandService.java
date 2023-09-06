package com.springbootlearn.rentACar.business.abstracts;

import com.springbootlearn.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<GetAllBrandsResponse> getAll();
}
