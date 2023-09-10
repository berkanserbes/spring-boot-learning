package com.springbootlearn.rentACar.business.abstracts;

import com.springbootlearn.rentACar.business.requests.CreateModelRequest;
import com.springbootlearn.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
