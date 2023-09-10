package com.springbootlearn.rentACar.webApi.controllers;

import com.springbootlearn.rentACar.business.abstracts.BrandService;
import com.springbootlearn.rentACar.business.requests.CreateBrandRequest;
import com.springbootlearn.rentACar.business.requests.UpdateBrandRequest;
import com.springbootlearn.rentACar.business.responses.GetAllBrandsResponse;
import com.springbootlearn.rentACar.business.responses.GetByIdBrandResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    public BrandService brandService;

    @GetMapping()
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id) {
        return brandService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.brandService.delete(id);
    }
}
