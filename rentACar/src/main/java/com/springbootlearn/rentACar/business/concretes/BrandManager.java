package com.springbootlearn.rentACar.business.concretes;

import com.springbootlearn.rentACar.business.abstracts.BrandService;
import com.springbootlearn.rentACar.business.requests.CreateBrandRequest;
import com.springbootlearn.rentACar.business.requests.UpdateBrandRequest;
import com.springbootlearn.rentACar.business.responses.GetAllBrandsResponse;
import com.springbootlearn.rentACar.business.responses.GetByIdBrandResponse;
import com.springbootlearn.rentACar.business.rules.BrandBusinessRules;
import com.springbootlearn.rentACar.core.utilities.mappers.ModelMapperService;
import com.springbootlearn.rentACar.dataAccess.abstracts.BrandRepository;
import com.springbootlearn.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        /*
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for(Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }
        */
        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = this.modelMapperService.forResponse()
                .map(brand, GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        //Brand brand = new Brand();
        //brand.setName(createBrandRequest.getName());
        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
