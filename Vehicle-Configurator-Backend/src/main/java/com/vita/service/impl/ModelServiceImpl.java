package com.vita.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vita.model.Model;
import com.vita.repositoty.ModelRepository;
import com.vita.service.ModelService;


@Service
public  class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<Model> getAllModelsByManuIdAndSegId( long segId,long manuID) 
    {
        return modelRepository.findByManufacturerIdAndSegmentId( segId,manuID);
    }
    
    @Override
    public List<Model> getAllModels() 
    {
       return modelRepository.findAll();
    	
    }
    
    @Override
    public Model getModelsById(long id) {
        return modelRepository.findById(id).get();
    }
    
}