package com.springbootlearn.rentACar.webApi.controllers;

import com.springbootlearn.rentACar.business.abstracts.ModelService;
import com.springbootlearn.rentACar.business.requests.CreateModelRequest;
import com.springbootlearn.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping
    List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    void add(@RequestBody CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

}
