package com.springbootlearn.rentACar.business.abstracts;

import com.springbootlearn.rentACar.business.requests.CreateBrandRequest;
import com.springbootlearn.rentACar.business.requests.UpdateBrandRequest;
import com.springbootlearn.rentACar.business.responses.GetAllBrandsResponse;
import com.springbootlearn.rentACar.business.responses.GetByIdBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
     void add(CreateBrandRequest createBrandRequest);
     void update(UpdateBrandRequest updateBrandRequest);
     void delete(int id);
}
