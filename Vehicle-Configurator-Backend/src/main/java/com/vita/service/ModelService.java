package com.vita.service;


import java.util.List;

import com.vita.model.Model;

public interface ModelService 
{
	List<Model> getAllModelsByManuIdAndSegId(long segId,long manuId);
	
	List<Model> getAllModels();
	
	Model getModelsById(long id);
}