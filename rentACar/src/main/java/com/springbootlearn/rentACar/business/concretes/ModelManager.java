package com.springbootlearn.rentACar.business.concretes;

import com.springbootlearn.rentACar.business.abstracts.ModelService;
import com.springbootlearn.rentACar.business.requests.CreateModelRequest;
import com.springbootlearn.rentACar.business.responses.GetAllModelsResponse;
import com.springbootlearn.rentACar.core.utilities.mappers.ModelMapperService;
import com.springbootlearn.rentACar.dataAccess.abstracts.ModelRepository;
import com.springbootlearn.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponse = models.stream()
                .map(model -> this.modelMapperService.forResponse()
                        .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());

        return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);

        this.modelRepository.save(model);
    }
}
